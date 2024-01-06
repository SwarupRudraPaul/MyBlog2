package com.myBlog2.MyBlog2.repository;

import com.myBlog2.MyBlog2.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity,Integer> {
}
