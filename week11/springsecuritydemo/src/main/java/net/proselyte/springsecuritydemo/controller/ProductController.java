package net.proselyte.springsecuritydemo.controller;

import javassist.NotFoundException;
import net.proselyte.springsecuritydemo.exeption.EntityNotFoundException;
import net.proselyte.springsecuritydemo.entity.Product;
import net.proselyte.springsecuritydemo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl service;

    @GetMapping("/all")
    @PreAuthorize("hasAuthority('products:read')")
    public List<Product> listAllProducts(){
        return service.getAll();
    }

    @GetMapping(value = "/{productId}")
    @PreAuthorize("hasAuthority('products:read')")
    public Product getProduct(@PathVariable("productId") Long productId) throws NotFoundException {
        return service.getById(productId);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('products:write')")
    public Product createProduct(@RequestBody Product product) {
        return service.create(product);
    }

    @PutMapping(value = "/{productId}")
    @PreAuthorize("hasAuthority('products:write')")
    public Product updateProduct(@RequestBody Product product,
                                               @PathVariable("productId") Long productId) throws NotFoundException {
        return service.updateById(productId,product);
    }

    @DeleteMapping(value = "/{productId}")
    @PreAuthorize("hasAuthority('products:write')")
    public Product deleteProduct(@PathVariable("productId") Long productId) throws NotFoundException {
        return service.deleteById(productId);
    }

}
