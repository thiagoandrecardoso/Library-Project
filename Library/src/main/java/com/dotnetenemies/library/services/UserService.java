package com.dotnetenemies.library.services;

import com.dotnetenemies.library.models.User;
import com.dotnetenemies.library.repositories.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final IUserRepository userRepository;

    public List<User> GetUsers() {
        return userRepository.findAll();
    }
}
