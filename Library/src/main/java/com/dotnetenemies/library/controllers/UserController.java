package com.dotnetenemies.library.controllers;
import com.dotnetenemies.library.models.User;
import com.dotnetenemies.library.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("users")
@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity GetUsers (){
       List<User> users = userService.GetUsers();

       if (users.isEmpty()) return ResponseEntity.notFound().build();

       return ResponseEntity.ok(users);
    }

}
