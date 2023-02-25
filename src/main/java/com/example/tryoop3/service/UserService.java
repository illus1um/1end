package com.example.tryoop3.service;
import com.example.tryoop3.entities.User;
import com.example.tryoop3.repositories.UserRepository;
import com.example.tryoop3.service.interfaces.IUserService;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Objects;
//, UserDetailsService
@Service
public class UserService implements IUserService {

    private  final UserRepository userRepository;

    public UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User signUpSave(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserByEmail(String email) {
        return  userRepository.findByEmail(email);
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User user = getUserByEmail(email);
//        if (Objects.isNull(user)) {
//            throw new UsernameNotFoundException(String.format("User %s is not found", email));
//        }
//        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), true, true, true, true, new HashSet<>());
//    }
}