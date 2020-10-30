package com.alex.spring.boot.blog.service;

import com.alex.spring.boot.blog.domain.Comment;

/**
 * Comment服务接口
 */
public interface CommentService {

    /**
     * 根据ID获取Comment
     */
    Comment getCommentById(Long id);

    /**
     * 删除评论
     */
    void removeComment(Long id);
}
