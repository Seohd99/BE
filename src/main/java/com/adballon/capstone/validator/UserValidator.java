package com.adballon.capstone.validator;

import com.adballon.capstone.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserValidator {
    public static void checkUser(Optional<User> user){
        if(user.isPresent()) throw new IllegalStateException("중복된 아이디입니다.");
        //비밀번호가 다를 때
    }
}
