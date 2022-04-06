package net.proselyte.springsecuritydemo.service;

import net.proselyte.springsecuritydemo.entity.User;
import net.proselyte.springsecuritydemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> deleteUser(long id) {
        return Optional.empty();
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
