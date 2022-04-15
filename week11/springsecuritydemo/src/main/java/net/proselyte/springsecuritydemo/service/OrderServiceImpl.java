package net.proselyte.springsecuritydemo.service;

import javassist.NotFoundException;
import net.proselyte.springsecuritydemo.entity.Order;
import net.proselyte.springsecuritydemo.entity.Product;
import net.proselyte.springsecuritydemo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository repository;

    @Override
    public List<Order> getAll() {
        Iterable<Order> orderIterable = repository.findAll();
        List<Order> orderList = new ArrayList<>();
        for (Order order : orderIterable){
            orderList.add(order);
        }
        return orderList;
    }

    @Override
    public Order getById(Long id) throws NotFoundException {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Don't have order - " + id));

    }

    @Override
    public Order create(Order order) {
        return repository.save(order);

    }

    @Override
    public Order updateById(Long id, Order order) throws NotFoundException {
        Order order1 = repository.findById(id).orElseThrow(() -> new NotFoundException("Don't have order - " + id));
        return repository.save(order1);
    }

    @Override
    public void deleteById(Long id) throws NotFoundException {
        Order order = repository.findById(id).orElseThrow(() -> new NotFoundException("Don't have order - " + id));
        repository.delete(order);

    }


//    private Order toEntity(OrderModel orderModel) {
//        Order order = new Order();
//        order.setId(orderModel.getId());
//        order.setUser(orderModel.getUser());
//        order.setProductList(orderModel.getProductList());
//        return order;
//    }
}
