package com.alex.spring.boot.blog.service;

import com.alex.spring.boot.blog.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Authority服务接口
 */
public interface AuthorityService {

    /**
     * 根据id查询Authority
     */
    Authority getAuthorityById(Long id);

}
