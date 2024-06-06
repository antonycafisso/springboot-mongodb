package com.antonycafisso.springbootmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antonycafisso.springbootmongodb.domain.Post;
import com.antonycafisso.springbootmongodb.repositories.PostRepository;
import com.antonycafisso.springbootmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
    @Autowired
    public PostRepository postRepository;

    public Post findById(String id){
        Optional<Post> post = postRepository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }
}
