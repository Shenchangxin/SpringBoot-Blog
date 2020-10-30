package com.alex.spring.boot.blog.service;

import com.alex.spring.boot.blog.domain.Vote;

/**
 * Vote服务接口
 */
public interface VoteService {

    /**
     * 根据id获取Vote
     */
    Vote getVoteById(Long id);

    /**
     * 删除Vote
     */
    void removeVote(Long id);
}
