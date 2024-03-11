package com.example.demo.controller;

import com.example.demo.Entity.Category;
import com.example.demo.Entity.OrderDetail;
import com.example.demo.Entity.Orders;
import com.example.demo.Entity.Product;
import com.example.demo.Service.OrderDetailService;
import com.example.demo.Service.OrderService;
import com.example.demo.Service.ProductService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class OrderDetailController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderDetailService orderDetailService;

    @GetMapping("/order-detail/hien-thi")
    String hienThi(Model model){

        List<OrderDetail> listOrderDetail = orderDetailService.getAll();
        List<Orders> listOrders = orderService.getAll();
        List<Product> listProduct = productService.getAll();
        model.addAttribute("listOrderDetail",listOrderDetail);
        model.addAttribute("listOrders",listOrders);
        model.addAttribute("listProduct",listProduct);
        return "orderDetail";
    }

    @PostMapping("/order-detail/addNew")
    String addNew(@RequestParam("order") Orders orders,
                  @RequestParam("product") Product product,
                  @RequestParam("price")BigDecimal price,
                  @RequestParam("quantity") Integer quantity
                  ){

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrders(orders);
        orderDetail.setProduct(product);
        orderDetail.setPrice(price);
        orderDetail.setQuantity(quantity);
        orderDetailService.add(orderDetail);
        return "redirect:/order-detail/hien-thi";
    }


    @GetMapping("/order-detail/delete/{id}")
    String delete(@PathVariable("id") Integer id){
        orderDetailService.delete(id);
        return "redirect:/order-detail/hien-thi";
    }

    @GetMapping("/order-detail/detail/{id}")
    String detail(Model model,
                  @PathVariable("id") Integer id){
        OrderDetail orderDetail = orderDetailService.detail(id);
        List<Orders> listOrders = orderService.getAll();
        List<Product> listProduct = productService.getAll();
        model.addAttribute("orderDetail",orderDetail);
        model.addAttribute("listOrders",listOrders);
        model.addAttribute("listProduct",listProduct);
        return "orderDetail-Detail";
    }
}
