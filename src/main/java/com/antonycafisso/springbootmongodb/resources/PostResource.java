package com.antonycafisso.springbootmongodb.resources;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.antonycafisso.springbootmongodb.domain.Post;
import com.antonycafisso.springbootmongodb.domain.User;
import com.antonycafisso.springbootmongodb.dto.PostDTO;
import com.antonycafisso.springbootmongodb.dto.UserDTO;
import com.antonycafisso.springbootmongodb.services.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {
    @Autowired
    private PostService postService;

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post post  = postService.findById(id);
        return ResponseEntity.ok().body(post);
    }
}
