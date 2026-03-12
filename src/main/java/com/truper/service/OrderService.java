package com.truper.service;

import com.truper.entity.Order;
import com.truper.entity.Product;
import com.truper.repository.OrderRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;
    private ProductService productService;

    @Transactional
    public Order saveOrder(Order order){

        List<Product> productsCreated = productService.saveProducts(order.getProducts());

        order.setProducts(productsCreated);
        return orderRepository.save(order);
    }

    public Order getById(Integer id) {
        return orderRepository.findById(id).get();
    }
}
