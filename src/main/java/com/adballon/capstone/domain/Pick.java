package com.adballon.capstone.domain;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter    @Builder
@AllArgsConstructor  @NoArgsConstructor
public class Pick {

    @Id @ManyToOne
    @JoinColumn(name = "user_id")
//    @Column(name = "user_id")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "post_id")
//    @Column(name = "post_id")
    private Post postId;
}
