package net.proselyte.springsecuritydemo.service;

import javassist.NotFoundException;
import net.proselyte.springsecuritydemo.entity.Product;
import net.proselyte.springsecuritydemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository;



    @Override
    public List<Product> getAll() {
        Iterable<Product> products = repository.findAll();
        List<Product> productModels = new ArrayList<>();
        for (Product product : products){
            productModels.add(product);
        }
        return productModels;
    }

    @Override
    public Product getById(Long id) throws NotFoundException {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Don't have product - " + id));
    }

    @Override
    public Product create(Product product) {
        return repository.save(product);
    }

    @Override
    public Product updateById(Long id, Product productModel) throws NotFoundException {
        Product product = repository.findById(id).orElseThrow(() -> new NotFoundException("Don't have product - " + id));
        return repository.save(product);
    }

    @Override
    public void deleteById(Long id) throws NotFoundException {
        Product product = repository.findById(id).orElseThrow(() -> new NotFoundException("Don't have product - " + id));
        repository.delete(product);
    }

//    @Override
//    public ProductModel toModel(Product product) {
//       ProductModel productModel = new ProductModel();
//
//       productModel.setId(product.getId());
//       productModel.setName(product.getName());
//       productModel.setPrice(product.getPrice());
//       productModel.setCategory(product.getCategory());
//       productModel.setExpiryDate(product.getExpiryDate());
//       productModel.setDateOfManufacture(product.getDateOfManifacture());
//        return productModel;
//    }

//    public Product toEntity(Product productModel) {
//        Product product = new Product();
//        product.setId(productModel.getId());
//        product.setName(productModel.getName());
//        product.setExpiryDate(productModel.getExpiryDate());
//        product.setDateOfManifacture(productModel.getDateOfManufacture());
//        product.setPrice(productModel.getPrice());
//        product.setCategory(productModel.getCategory());
//        return product;
//    }

}

