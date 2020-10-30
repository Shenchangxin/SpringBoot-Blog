package com.alex.spring.boot.blog.service;

//import com.alex.spring.boot.blog.domain.User;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//class UserServiceImplTest {
//
//    @Autowired
//    private UserServiceImpl userService;
//
//    @Test
//    void saveOrUpdateUser() {
//        User user = new User(11L,"999","9998","666@193.com");
//        userService.saveOrUpdateUser(user);
//
//    }
//
//    @Test
//    void registerUser() {
//        User user = new User(12L,"888","8887","999@193.com");
//        userService.registerUser(user);
//    }
//
//    @Test
//    void removeUser() {
//        userService.removeUser(3L);
//    }
//
//    @Test
//    void getUserById() {
//        User user = userService.getUserById(1L);
//        System.out.println(user);
//    }
//
//    @Test
//    void listUsersByNameLike() {
//        Page<User> page = userService.listUsersByNameLike("waylau", Pageable.unpaged());
//        System.out.println(page);
//    }
//
//    @Test
//    void loadUserByUsername() {
//        User userDetails = userService.loadUserByUsername("waylau");
//        System.out.println(userDetails);
//    }
//}