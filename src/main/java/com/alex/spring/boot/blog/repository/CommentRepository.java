package com.alex.spring.boot.blog.repository;

import com.alex.spring.boot.blog.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Comment仓库
 */
public interface CommentRepository extends JpaRepository<Comment,Long> {
}
