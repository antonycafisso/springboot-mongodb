package com.antonycafisso.springbootmongodb.config;

import com.antonycafisso.springbootmongodb.domain.Post;
import com.antonycafisso.springbootmongodb.domain.User;
import com.antonycafisso.springbootmongodb.repositories.PostRepository;
import com.antonycafisso.springbootmongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");
        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post p1 = new Post(null, sdf.parse("2018-03-21"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", maria);
        postRepository.save(p1);

    }
}
