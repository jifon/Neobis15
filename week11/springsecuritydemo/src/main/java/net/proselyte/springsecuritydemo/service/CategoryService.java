package net.proselyte.springsecuritydemo.service;

import javassist.NotFoundException;
import net.proselyte.springsecuritydemo.entity.Category;
import net.proselyte.springsecuritydemo.entity.Product;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> getAll();

    Category getById(Long id) throws NotFoundException;

    Category create(Category category);

    Category updateById(Long id, Category Category) throws NotFoundException;

    void deleteById(Long id) throws NotFoundException;



}