package net.proselyte.springsecuritydemo.service;

import net.proselyte.springsecuritydemo.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    public void addOrder(Order order);

    public List<Order> listOrder();

    public void deleteOrder(long orderId);

    public void updateOrder(Order order);

    public Optional<Order> getOrder(long orderId);

}
