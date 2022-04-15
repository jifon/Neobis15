package net.proselyte.springsecuritydemo.service;

import javassist.NotFoundException;
import net.proselyte.springsecuritydemo.entity.Product;
import net.proselyte.springsecuritydemo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAll();

    User getById(Long id) throws NotFoundException;

    User create(User user);

    User updateById(Long id, User user) throws NotFoundException;

    void deleteById(Long id) throws NotFoundException;

}
