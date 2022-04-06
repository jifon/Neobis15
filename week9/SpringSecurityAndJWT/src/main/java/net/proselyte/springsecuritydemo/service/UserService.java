package net.proselyte.springsecuritydemo.service;

import net.proselyte.springsecuritydemo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void createUser(User user);
    List<User> getAllUsers();
    public void updateUser(User user);
    Optional<User> deleteUser(long id);
}
