package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.entity.OrderDetails;
import com.example.demo.entity.Product;
import com.example.demo.repository.OrderDetailsRepository;
import com.example.demo.service.OrderDetailsService;
import com.example.demo.service.OrderService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BanHangController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;
    @Autowired
    private OrderDetailsService orderDetailsService;
    List<Order> orderList;
    List<Product> productList;
    List<OrderDetails> orderDetailsList;
    Order order = new Order();
    Integer orderId;

    @GetMapping("/hien-thi-ban-hang")
    public String banHang(Model model) {
        orderList = orderService.getAll();
        orderDetailsList = orderDetailsRepository.getByOrderId(orderId);
        productList = productService.getAll();
        Double tongTien = orderDetailsRepository.getTotalAmount(orderId);
        model.addAttribute("tongTien", tongTien);
        model.addAttribute("orderList", orderList);
        model.addAttribute("productList", productList);
        model.addAttribute("invoiceIsSelected", orderDetailsList);
        model.addAttribute("order", order);
        return "/banhang/ban-hang";
    }

    @PostMapping("/delete-order")
    public String deleteByIdOrder(@ModelAttribute("order") Order order) {
        orderDetailsRepository.deleteOrderDetailsByIdOrder(order.getId());
        return "redirect:/hien-thi-ban-hang";
    }


    @GetMapping("/showListHoaDonDetails")

    public String showListHoaDonDetails(@RequestParam("id") Integer id, Model model) {
        orderId = id;
        orderDetailsList = orderDetailsRepository.getByOrderId(id);
        order = orderService.finById(id);
        return "redirect:/hien-thi-ban-hang";
    }

    @GetMapping("/mua-hang")
    public String shopping(@RequestParam("id") Integer id, Model model) {

        Product product = productService.finById(id);
        if(product.getAvaliable()==0){
            model.addAttribute("error","Quantity is out of stock");
            return "forward:/hien-thi-ban-hang";
        }
        if(orderId==null){
            model.addAttribute("errorLoiChon","Please select the person placing the order.");
            return "forward:/hien-thi-ban-hang";
        }
        Order od = orderService.finById(orderId);
        OrderDetails old = orderDetailsRepository.getByOrderIdAndProductId(orderId, id);
        System.out.println("Log id order"+" "+od);
        if (old == null) {
            // them moi order detail
            OrderDetails orderDetails = new OrderDetails();
            orderDetails.setProduct(product);
            orderDetails.setOrder(od);
            orderDetails.setPrice(product.getPrice());
            orderDetails.setQuantily(1);
            //B3: tao hoa don chi tiet va load lai hoa don chi tiet
            orderDetailsService.save(orderDetails);
            // B4: Tru so luong trong product va load lại danh sach product
            Integer sl = product.getAvaliable() - 1;
            product.setAvaliable(sl);
            productService.save(product);
        } else {
            // update order detail
            old.setQuantily(old.getQuantily() + 1);
            orderDetailsService.save(old);
            // update sl product
            Integer sl = product.getAvaliable() - 1;
            product.setAvaliable(sl);
            productService.save(product);
        }
        return "redirect:/hien-thi-ban-hang";
    }

    @GetMapping("/cancel")
    public String cancel(@RequestParam("id") Integer id, @RequestParam("productId") Integer productId) {//B1: Xoá đi orderDetail đã được cancel khỏi giỏ hàng
        Integer quantilyProduct = orderDetailsRepository.getOrderDetailsById(id);
        Product product = productService.getProductById(productId);
        product.setAvaliable(product.getAvaliable() + quantilyProduct);
        productService.save(product);
        orderDetailsRepository.deleteById(id);
        return "redirect:/hien-thi-ban-hang";
    }
}