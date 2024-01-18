package com.adballon.capstone.service;

import com.adballon.capstone.domain.User;
import com.adballon.capstone.exception.NotCorrespondingIdException;
import com.adballon.capstone.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    /**
     * 회원가입
     * @param id
     * @param pw
     * @return 사용자
     */
    public User join(String id, String pw){
        User user = User.builder().id(id).pw(pw).build();
        userRepository.save(user);
        return user;
    }

    /**
     * 로그인
     * @param id,pw
     * @return 사용자 아이디
     */
    public String login(String id, String pw) {
        Optional<User> findUser = userRepository.findById(id);
        if(!findUser.orElseThrow(()->new NotCorrespondingIdException("해당 아이디가 존재하지 않습니다.")).checkPassword(pw)){
            throw new IllegalStateException("아이디와 비밀번호가 일치하지 않습니다.");
        }
        return findUser.get().getId();
    }

    //수정
    public void updateUser(User user){
        // if(userRepository.findById(user.getId()).orElseThrow(()-> new IllegalArgumentException(""));
        userRepository.save(user);
    }

    //삭제
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    //아이디 중복체크
    public String userIdCheck(String id){
        Optional<User> found = userRepository.findById(id);
        if (found.isPresent()) throw new IllegalArgumentException("중복된 아이디입니다.");
        return id;
    }
    //닉네임 중복체크
    public String userNickNameCheck(String nickname){
        Optional<User> found = userRepository.findByNickname(nickname);
        if (found.isPresent()) throw new IllegalArgumentException("중복된 닉네임입니다.");
        return nickname;
    }
    //이메일 중복체크
    public String userEmail(String email){
        Optional<User> found = userRepository.findByEmail(email);
        if (found.isPresent()) throw new IllegalArgumentException("중복된 닉네임입니다.");
        return email;
    }
}
