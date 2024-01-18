package com.adballon.capstone.domain;

import com.adballon.capstone.util.Grade;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter  @Builder
@AllArgsConstructor @NoArgsConstructor
@Table(name = "Users")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private String id;
    @Column(name = "user_pw")
    private String pw;
    @Column(name = "user_nickname")
    private String nickname;
    @Column(name = "user_phone")
    private String phone;
    @Column(name = "bis_no")
    private String bisno;
    @Column(name = "user_addr")
    private String addr;
    @Column(name = "user_acc")
    private String account;
    @Column(name = "user_img")
    private String img;
    @Column(name = "user_grade")
    private Grade grade;

    public boolean checkPassword(String pw){
        return this.pw.equals(pw);
    }
}


