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
    public ResponseEntity<List<Product>> listAllProducts() {
        List<Product> products = service.getAll();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/{productId}")
    @PreAuthorize("hasAuthority('products:read')")
    public ResponseEntity<Product> getProduct(@PathVariable("productId") Long productId) throws EntityNotFoundException, NotFoundException {
        Optional<Product> product = Optional.ofNullable(service.getById(productId));
        if (!product.isPresent())
            throw new EntityNotFoundException("id-" + productId);
        return ResponseEntity.ok().body(product.get());
    }

    @PostMapping
    @PreAuthorize("hasAuthority('products:write')")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.status(201).body(service.create(product));
    }

    @PutMapping(value = "/{productId}")
    @PreAuthorize("hasAuthority('products:write')")
    public ResponseEntity<Product> updateProduct(@RequestBody Product productModel,
                                               @PathVariable("productId") Long productId) throws EntityNotFoundException, NotFoundException {
        Optional<Product> p = Optional.ofNullable(service.getById(productId));
        if (!p.isPresent())
            throw new EntityNotFoundException("id-" + productId);
        return ResponseEntity.ok().body(service.updateById(productId,productModel));
    }

    @DeleteMapping(value = "/{productId}")
    @PreAuthorize("hasAuthority('products:write')")
    public ResponseEntity<Product> deletePerson(@PathVariable("productId") Long productId) throws EntityNotFoundException, NotFoundException {
        Optional<Product> p = Optional.ofNullable(service.getById(productId));
        if (!p.isPresent())
            throw new EntityNotFoundException("id-" + productId);
        service.deleteById(productId);
        return ResponseEntity.ok().body(p.get());
    }

}
