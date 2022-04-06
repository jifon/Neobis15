package net.proselyte.springsecuritydemo.repository;

import net.proselyte.springsecuritydemo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}

//Now we can use JpaRepository’s methods:
// save(), findOne(), findById(), findAll(),
// count(), delete(), deleteById()…
// without implementing these methods

