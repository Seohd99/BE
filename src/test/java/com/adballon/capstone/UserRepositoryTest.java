package com.adballon.capstone;

import com.adballon.capstone.domain.User;
import com.adballon.capstone.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.Assertions;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
public class UserRepositoryTest {

    @Autowired
    UserRepository UserRepository;


    @Test
    @Transactional
    @Rollback(false)
    public void testUser() throws Exception{
        User user = new User();
        user.setId("kimbab");
        String savedId = UserRepository.save(user);
        User findUser = UserRepository.findById(savedId);
        Assertions.assertEquals(user.getId(), findUser.getId());
//        Assertions.assertEquals(user.getUser_pw(), findUser.getUser_pw());
//        Assertions.assertEquals(user, findUser); // JPA 엔티티 동일성 보장
    }
}
