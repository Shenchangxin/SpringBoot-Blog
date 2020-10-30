package com.alex.spring.boot.blog.repository;

import com.alex.spring.boot.blog.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 点赞仓库接口
 */
public interface VoteRepository extends JpaRepository<Vote,Long> {
}
