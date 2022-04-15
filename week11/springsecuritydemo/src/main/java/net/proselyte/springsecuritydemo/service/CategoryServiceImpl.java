package net.proselyte.springsecuritydemo.service;

import javassist.NotFoundException;
import net.proselyte.springsecuritydemo.entity.Category;
import net.proselyte.springsecuritydemo.entity.Product;
import net.proselyte.springsecuritydemo.repository.CategoryRepository;
import net.proselyte.springsecuritydemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository repository;


    @Override
    public List<Category> getAll() {
        Iterable<Category> categoryIterable = repository.findAll();
        List<Category> categories = new ArrayList<>();
        for (Category category : categoryIterable){
            categories.add(category);
        }
        return categories;
    }

    @Override
    public Category getById(Long id) throws NotFoundException {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Don't have category - " + id));

    }

    @Override
    public Category create(Category category) {
        return repository.save(category);

    }

    @Override
    public Category updateById(Long id, Category category) throws NotFoundException {
        Category category1 = repository.findById(id).orElseThrow(() -> new NotFoundException("Don't have category - " + id));
        return repository.save(category1);
    }

    @Override
    public void deleteById(Long id) throws NotFoundException {
        Category category = repository.findById(id).orElseThrow(() -> new NotFoundException("Don't have category - " + id));
        repository.delete(category);
    }


//    private Category toEntity(CategoryModel categoryModel) {
//        Category category = new Category();
//        category.setId(categoryModel.getId());
//        category.setName(categoryModel.getName());
//        return category;
//    }

}
