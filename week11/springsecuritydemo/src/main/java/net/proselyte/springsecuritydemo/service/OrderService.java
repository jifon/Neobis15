package net.proselyte.springsecuritydemo.service;

import javassist.NotFoundException;
import net.proselyte.springsecuritydemo.entity.Order;
import net.proselyte.springsecuritydemo.entity.Product;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<Order> getAll();

    Order getById(Long id) throws NotFoundException;

    Order create(Order order);

    Order updateById(Long id, Order order) throws NotFoundException;

    void deleteById(Long id) throws NotFoundException;

}
