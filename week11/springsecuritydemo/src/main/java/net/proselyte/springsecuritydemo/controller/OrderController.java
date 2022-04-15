package net.proselyte.springsecuritydemo.controller;

import javassist.NotFoundException;
import net.proselyte.springsecuritydemo.entity.Order;
import net.proselyte.springsecuritydemo.exeption.EntityNotFoundException;
import net.proselyte.springsecuritydemo.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderServiceImpl service;

    @GetMapping("/all")
    @PreAuthorize("hasAuthority('orders:read')")
    public List<Order> listAllOrders() {
        return service.getAll();
    }

    @GetMapping(value = "/{orderId}")
    @PreAuthorize("hasAuthority('orders:read')")
    public Order getOrder(@PathVariable("orderId") Long orderId) throws NotFoundException {
        return service.getById(orderId);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('orders:write')")
    public Order createOrder(@RequestBody Order order) {
        return service.create(order);
    }

    @PutMapping(value = "/{orderId}")
    @PreAuthorize("hasAuthority('orders:write')")
    public Order updateOrder(@RequestBody Order order,
                                                 @PathVariable("orderId") Long orderId) throws NotFoundException {
        return service.getById(orderId);
    }

    @DeleteMapping(value = "/{orderId}")
    @PreAuthorize("hasAuthority('orders:write')")
    public Order deleteOrder(@PathVariable("orderId") Long orderId) throws NotFoundException {
        return service.getById(orderId);
    }

}
