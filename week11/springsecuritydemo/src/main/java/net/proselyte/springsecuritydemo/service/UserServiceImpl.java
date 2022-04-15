package net.proselyte.springsecuritydemo.service;

import javassist.NotFoundException;
import net.proselyte.springsecuritydemo.entity.Order;
import net.proselyte.springsecuritydemo.entity.User;
import net.proselyte.springsecuritydemo.repository.OrderRepository;
import net.proselyte.springsecuritydemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getAll() {
        Iterable<User> userIterable = repository.findAll();
        List<User> userList = new ArrayList<>();
        for (User user : userIterable){
            userList.add(user);
        }
        return userList;
    }

    @Override
    public User getById(Long id) throws NotFoundException {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Don't have user - " + id));
    }

    @Override
    public User create(User user) {return repository.save(user);}

    @Override
    public User updateById(Long id, User user) throws NotFoundException {
        User user1 = repository.findById(id).orElseThrow(() -> new NotFoundException("Don't have user - " + id));
        return repository.save(user1);
    }

    @Override
    public void deleteById(Long id) throws NotFoundException {
        User User = repository.findById(id).orElseThrow(() -> new NotFoundException("Don't have user - " + id));
        repository.delete(User);

    }
//    private User toEntity(UserModel userModel) {
//        User user = new User();
//        user.setId(userModel.getId());
//        user.setFirstName(userModel.getFirstName());
//        user.setLastName(userModel.getLastName());
//        user.setEmail(userModel.getEmail());
//        user.setRole(userModel.getRole());
//        user.setStatus(userModel.getStatus());
//        user.setPassword(userModel.getPassword());
//
//        return user;
//    }
}
