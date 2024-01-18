package com.adballon.capstone.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter    @Builder
@AllArgsConstructor  @NoArgsConstructor
public class Follow {

    @Id @ManyToOne
    @JoinColumn(name = "following_id")
    private User id;

    @Id @ManyToOne
    @JoinColumn(name = "follower_id")
    private User targetId;


    //DB에 저장안하는 부분
    private Long follower;
    private Long following;
    public void setFollower(Long follower) {
        this.follower = follower;
    }
    public void setFollowing(Long following) {
        this.following = following;
    }
}
