package com.daolycodebuffer.Springboot.tutorial.repository;
import com.daolycodebuffer.Springboot.tutorial.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import com.daolycodebuffer.Springboot.tutorial.model.Admin;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin, Long>{
    List<Admin> findByNameContaining(String name);
}
