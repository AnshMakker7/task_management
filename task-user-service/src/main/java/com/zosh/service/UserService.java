package com.zosh.service;

import com.zosh.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public User getUserProfile(String jwt);

    public List<User> getAllUsers();
}
