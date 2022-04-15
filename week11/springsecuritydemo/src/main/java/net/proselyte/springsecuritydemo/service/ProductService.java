package net.proselyte.springsecuritydemo.service;

import javassist.NotFoundException;
import net.proselyte.springsecuritydemo.entity.Product;

import java.util.List;

public interface ProductService {



    List<Product> getAll();

    Product getById(Long id) throws NotFoundException;

    Product create(Product product);

    Product updateById(Long id, Product productModel) throws NotFoundException;

    Product deleteById(Long id) throws NotFoundException;



}
