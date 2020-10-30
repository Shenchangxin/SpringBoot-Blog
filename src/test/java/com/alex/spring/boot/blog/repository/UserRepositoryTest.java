package com.alex.spring.boot.blog.repository;

import com.alex.spring.boot.blog.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;
    @Test
    void findByNameLike() {
        Page<User> page = userRepository.findByNameLike("waylau", Pageable.unpaged());
        System.out.println(page);
    }

    @Test
    void findByUsername() {
        User user = userRepository.findByUsername("waylau");
        System.out.println(user);
    }
}