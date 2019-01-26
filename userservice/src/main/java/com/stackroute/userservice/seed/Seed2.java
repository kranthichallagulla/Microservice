package com.stackroute.userservice.seed;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Seed2 implements ApplicationListener<ContextRefreshedEvent> {

UserRepository userRepository;
    @Autowired
    public Seed2(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        userRepository.save(new User(1,"sahi","ahj"));
        userRepository.save(new User(2,"ammu","xjh"));


    }
}
