package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;

import com.stackroute.userservice.exceptions.UpdateException;
import com.stackroute.userservice.exceptions.UserAlreadyExistException;
import com.stackroute.userservice.exceptions.UserNotFoundException;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) throws UserAlreadyExistException {
        if (userRepository.existsById(user.getTrackId())) {
            throw new UserAlreadyExistException("user already exists");
        }
        User savedUser = userRepository.save(user);
        if (savedUser == null) {
            throw new UserAlreadyExistException("User already exists");
        }
        return savedUser;
    }

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) throws UpdateException {
        if (userRepository.existsById(user.getTrackId())) {
            throw new UpdateException("user already exists");
        }
        User savedUser = userRepository.save(user);
        if (savedUser == null) {
            throw new UpdateException("User already exists");
        }
        return savedUser;


    }

    @Override
    public List<User> getUpdateUser() throws UpdateException {

        return userRepository.findAll();
    }

    @Override
    public boolean deleteUser(int id) throws UserNotFoundException {
        boolean status = false;
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            status = true;

        } else {
            throw new UserNotFoundException("tracknotfound");
        }
        return status;
    }
}

   /* @Override
    public List<User> getDeleteUser(){
        return userRepository.findAll();
    }*/
