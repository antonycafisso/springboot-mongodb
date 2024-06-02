package com.antonycafisso.springbootmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.antonycafisso.springbootmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    
}
