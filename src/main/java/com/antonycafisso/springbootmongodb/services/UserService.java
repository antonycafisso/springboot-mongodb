package com.antonycafisso.springbootmongodb.services;

import com.antonycafisso.springbootmongodb.domain.User;
import com.antonycafisso.springbootmongodb.dto.UserDTO;
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

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }

    public User insert(User user) {
        return userRepository.insert(user);
    }

    public User fromDTO(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }

    public void delete(String id) {
        userRepository.deleteById(id);
    }

    public User updateData(User user, User userChange) {
        user.setId(userChange.getId());
        user.setName(userChange.getName());
        user.setEmail(userChange.getEmail());
        return user;
    }

    public User update(User obj) {
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return userRepository.save(newObj);
    }
}
