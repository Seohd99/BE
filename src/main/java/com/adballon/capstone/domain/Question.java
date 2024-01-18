package com.adballon.capstone.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter  @Builder
@AllArgsConstructor @NoArgsConstructor
public class Question {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id")
//    @Column(name = "user_id")
    private User userId;

    private String title;

    private String type;

    private String content;

    private String answer;

}
