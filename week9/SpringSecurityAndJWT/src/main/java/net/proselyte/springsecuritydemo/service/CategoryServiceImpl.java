package net.proselyte.springsecuritydemo.service;

import net.proselyte.springsecuritydemo.entity.Category;
import net.proselyte.springsecuritydemo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public List<Category> listCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public void deleteCategory(long categoryId) {
        categoryRepository.deleteById(categoryId);
    }

    @Override
    public void updateCategory(Category category) {
        categoryRepository.save((category));
    }

    @Override
    public Optional<Category> getCategory(long categoryId) {
        return categoryRepository.findById(categoryId);
    }


//    private Category toEntity(CategoryModel categoryModel) {
//        Category category = new Category();
//        category.setId(categoryModel.getId());
//        category.setName(categoryModel.getName());
//        return category;
//    }

}
