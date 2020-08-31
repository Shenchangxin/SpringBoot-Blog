package com.alex.spring.boot.blog.controller;

import com.alex.spring.boot.blog.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Media Type 控制器.

 */
@RestController
public class MediaTypeController {

    /**
     * 根据客户端请求的 Content-Type，响应相应的 UserVO 类型.
     */
    @RequestMapping("/user")
    public User getUser() {
        return new User();
    }

}
