package com.teamtreehouse.ingredients.service;

import com.teamtreehouse.ingredients.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUsername(String username);
}
