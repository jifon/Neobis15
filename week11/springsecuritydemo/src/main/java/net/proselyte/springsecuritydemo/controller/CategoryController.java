package net.proselyte.springsecuritydemo.controller;

import javassist.NotFoundException;
import net.proselyte.springsecuritydemo.entity.Category;
import net.proselyte.springsecuritydemo.exeption.EntityNotFoundException;
import net.proselyte.springsecuritydemo.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl service;

    @GetMapping("/all")
    @PreAuthorize("hasAuthority('categories:read')")
    public List<Category> listAllCategories() {
        return service.getAll();
    }

    @GetMapping(value = "/{categoryId}")
    @PreAuthorize("hasAuthority('categories:read')")
    public Category getCategory(@PathVariable("categoryId") Long categoryId) throws EntityNotFoundException, NotFoundException {
        return service.getById(categoryId);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('categories:write')")
    public Category createCategory(@RequestBody Category category) {
        return service.create(category);
    }

    @PutMapping(value = "/{categoryId}")
    @PreAuthorize("hasAuthority('categories:write')")
    public Category updateProduct(@RequestBody Category category,
                                                 @PathVariable("categoryId") Long categoryID) throws NotFoundException {
        return service.updateById(categoryID,category);
    }

    @DeleteMapping(value = "/{categoryID}")
    @PreAuthorize("hasAuthority('categories:write')")
    public Category deleteCategory(@PathVariable("categoryID") Long categoryId) throws NotFoundException {
        return service.getById(categoryId);
    }

}
