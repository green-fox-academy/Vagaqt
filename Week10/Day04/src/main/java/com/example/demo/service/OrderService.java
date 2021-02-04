package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.model.OrderRequestDTO;
import com.example.demo.model.OrderResponseDTO;
import com.example.demo.model.OrderStatusDTO;
import com.example.demo.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class OrderService {
    private OrderRepo orderRepo;

    @Autowired
    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public Order saveOrder(OrderRequestDTO orderRequestDTO) {
        Order order = new Order();
        order.setName(orderRequestDTO.getName());
        order.setAddress(orderRequestDTO.getAddress());
        order.setBase(orderRequestDTO.getBase());
        order.setTopping(orderRequestDTO.getTopping());
        order.setStatus("ordered");
        return orderRepo.save(order);
    }

    public Order findOrderById(Long id) {
        return orderRepo.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public List<OrderResponseDTO> findOrdersByStatusMethod(String status) {
        List<OrderResponseDTO> orderResponseDTOList = new ArrayList<>();
        List<Order> tempList = orderRepo.findAllByStatus(status);
        OrderResponseDTO orderResponseDTO = new OrderResponseDTO();


        for (int i = 0; i < tempList.size(); i++) {
            orderResponseDTO.setId(tempList.get(i).getId());
            orderResponseDTO.setName(tempList.get(i).getName());
            orderResponseDTO.setBase(tempList.get(i).getBase());
            orderResponseDTO.setTopping(tempList.get(i).getTopping());
            orderResponseDTO.setStatus(status);
            orderResponseDTOList.add(orderResponseDTO);
        }
        return orderResponseDTOList;
    }

    public Order updateOrderStatusMethod(Long id, OrderStatusDTO status){
        Order order = findOrderById(id);
        order.setStatus(status.getStatus());
        return order;
    }

    public OrderStatusDTO getOrderStatusDTO(Long id){
        Order order = findOrderById(id);
        OrderStatusDTO orderStatusDTO = new OrderStatusDTO();
        orderStatusDTO.setStatus(order.getStatus());
        return orderStatusDTO;
    }
}
