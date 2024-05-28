package com.antonycafisso.springbootmongodb.services;

import com.antonycafisso.springbootmongodb.domain.User;
import com.antonycafisso.springbootmongodb.repositories.UserRepository;
import com.antonycafisso.springbootmongodb.services.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll (){
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }
}
