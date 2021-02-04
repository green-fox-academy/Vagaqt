package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.model.OrderRequestDTO;
import com.example.demo.model.OrderResponseDTO;
import com.example.demo.model.OrderStatusDTO;
import com.example.demo.repository.OrderRepo;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@Controller
public class OrderController {
    private OrderService orderService;
    private OrderRepo orderRepo;

    @Autowired
    public OrderController(OrderService orderService, OrderRepo orderRepo) {
        this.orderService = orderService;
        this.orderRepo = orderRepo;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/order")
    public String createOrder(@ModelAttribute OrderRequestDTO orderRequestDTO) {
        Order order = new Order();
        order = orderService.saveOrder(orderRequestDTO);
        return "redirect:/order/" + order.getId();
    }

    @GetMapping("/order/{id}")
    public String orderSummary(@PathVariable Long id, Model model) {
        boolean orderExist;
        try {
            orderService.findOrderById(id);
            orderExist = true;
            model.addAttribute("orderExist", orderExist);
        } catch (NoSuchElementException e) {
            orderExist = false;
            model.addAttribute("orderExist", orderExist);
            model.addAttribute("order", id);
            return "order";
        }
        model.addAttribute("order", orderService.findOrderById(id));
        return "order";
    }

    @GetMapping("/api/orders")
    @ResponseBody
    public ResponseEntity<List<OrderResponseDTO>> getOrdersByStatus(@RequestParam String status) {
        if (status.equals("ordered") || status.equals("inprogress") || status.equals("done")) {
            return new ResponseEntity<>(orderService.findOrdersByStatusMethod(status), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @PatchMapping("/api/orders/{id}")
    @ResponseBody
    public ResponseEntity<?> updateOrderStatus(@PathVariable Long id, @RequestBody OrderStatusDTO status) {
        try {
            orderService.findOrderById(id);
            if (status.getStatus().equals("ordered") || status.getStatus().equals("inprogress") || status.getStatus().equals("done")) {
                return new ResponseEntity<>(orderService.updateOrderStatusMethod(id, status), HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
