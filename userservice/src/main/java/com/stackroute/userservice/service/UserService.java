package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;

import com.stackroute.userservice.exceptions.UpdateException;
import com.stackroute.userservice.exceptions.UserAlreadyExistException;
import com.stackroute.userservice.exceptions.UserNotFoundException;

import java.util.List;

public interface UserService {

    public User saveUser(User user) throws  UserAlreadyExistException;
    public List<User> getAllUsers();

    public User updateUser(User user) throws UpdateException;
    public List<User> getUpdateUser() throws UpdateException;

    public boolean deleteUser(int id) throws UserNotFoundException;
    //public List<User> getDeleteUser(int id);
}
