package com.example.demos.repository;

import com.example.demos.entity.Post;
import com.example.demos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByUserOrOrderByCreatedDateDesc(User user);

    List<Post> findAllByOrOrderByCreatedDateDesc();

    Optional<Post> findPostByIdAndUser(Long id, User user);



}
