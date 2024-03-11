package com.example.demo.controller;

import com.example.demo.Entity.OrderDetail;
import com.example.demo.Entity.Orders;
import com.example.demo.Entity.Product;
import com.example.demo.Repository.OrdersRepository;
import com.example.demo.Repository.OrderDetailsRepo;
import com.example.demo.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BanHangController {

    @Autowired
    private OrdersRepository odersRepository;
    @Autowired
    private OrderDetailsRepo orderDetailsRepo;
    @Autowired
    private ProductsRepository productsRepository;
    Integer orderId;
    List<Orders> list = new ArrayList<>();
    List<Product> listProduct = new ArrayList<>();
    List<OrderDetail> orderDetailList = new ArrayList<>();
    Orders orders = new Orders();

    @GetMapping("/ban-hang/hien-thi")
    String hienThi(Model model) {
        list = odersRepository.findAll();
        listProduct = productsRepository.findAll();
        model.addAttribute("products", listProduct);
        model.addAttribute("order", list);
        model.addAttribute("oders", orders);
        model.addAttribute("orderDetail", orderDetailList);

        return "ban-hang";
    }

    @GetMapping("/ban-hang/detail/{id}")
    String detail(Model model,
                  @PathVariable("id") Integer id) {
        orderId = id;
        orders = odersRepository.findById(id).get();
        orderDetailList = orderDetailsRepo.getAllOrderDetailById(id);
        return "redirect:/ban-hang/hien-thi";
    }

    @GetMapping("/ban-hang/mua/{id}")
    String mua(Model model,
               @PathVariable("id") Integer id
    ) {
        list = odersRepository.findAll();
        Product product = productsRepository.findById(id).get();
        Orders od = odersRepository.findById(orderId).get();
        OrderDetail odl = orderDetailsRepo.getByOrderIdAndProductId(orderId,id);
        if(odl == null){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrders(od);
        orderDetail.setProduct(product);
        orderDetail.setPrice(BigDecimal.valueOf(product.getPrice()));
        orderDetail.setQuantity(1);
        orderDetailsRepo.save(orderDetail);
            int sl = product.getAvailable() - 1;
            product.setAvailable(sl);
            productsRepository.save(product);
        }else {
            odl.setQuantity(odl.getQuantity() + 1);
            orderDetailsRepo.save(odl);
            int sl = product.getAvailable() - 1;
            product.setAvailable(sl);
            productsRepository.save(product);
        }
        orderDetailList = orderDetailsRepo.getAllOrderDetailById(orderId);
        listProduct = productsRepository.findAll();
        return "redirect:/ban-hang/hien-thi";
    }

}
