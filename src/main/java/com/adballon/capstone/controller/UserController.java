package com.adballon.capstone.controller;


import com.adballon.capstone.domain.User;
import com.adballon.capstone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.AuthenticationException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;


    /**
     * 로그인
     * @param user
     * @return Token
     */
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody User user) {
//        try {
//            String token = userService.login(user.getId(), user.getPw());
//        return ResponseEntity.ok()
//        } catch (AuthenticationException e) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//        }
//    }

}
