package net.proselyte.springsecuritydemo.repository;

import net.proselyte.springsecuritydemo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

//Now we can use JpaRepository’s methods:
// save(), findOne(), findById(), findAll(),
// count(), delete(), deleteById()…
// without implementing these methods

