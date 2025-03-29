package com.banksecurepro.service;

import com.banksecurepro.model.User;

public interface UserService {
    User registerUser(User user);
    User getUserByUsername(String username);
}
