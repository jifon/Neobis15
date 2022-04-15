package net.proselyte.springsecuritydemo.controller;

import javassist.NotFoundException;
import net.proselyte.springsecuritydemo.entity.Product;
import net.proselyte.springsecuritydemo.entity.User;
import net.proselyte.springsecuritydemo.exeption.EntityNotFoundException;
import net.proselyte.springsecuritydemo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @GetMapping("/all")
    @PreAuthorize("hasAuthority('users:read')")
    public List<User> listAllUsers() {
        return service.getAll();
    }

    @GetMapping(value = "/{usersId}")
    @PreAuthorize("hasAuthority('users:read')")
    public User getUsers(@PathVariable("usersId") Long userdId) throws NotFoundException {
        return service.getById(userdId);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('users:write')")
    public User createUser(@RequestBody User user) {
        return service.create(user);
    }

    @PutMapping(value = "/{usersId}")
    @PreAuthorize("hasAuthority('users:write')")
    public User updateUser(@RequestBody User user,
                                                 @PathVariable("usersId") Long useraId) throws  NotFoundException {
        return service.updateById(useraId,user);
    }

    @DeleteMapping(value = "/{usersId}")
    @PreAuthorize("hasAuthority('users:write')")
    public User deleteUser(@PathVariable("usersId") Long usersId) throws NotFoundException {
        return service.getById(usersId);
    }
}
