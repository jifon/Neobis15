package net.proselyte.springsecuritydemo.repository;

import net.proselyte.springsecuritydemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
//    public List<Product> findByCategory_CategoryId(Long CategoryId);
}

//Now we can use JpaRepository’s methods:
// save(), findOne(), findById(), findAll(),
// count(), delete(), deleteById()…
// without implementing these methods
