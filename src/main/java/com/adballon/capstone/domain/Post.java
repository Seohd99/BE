package com.adballon.capstone.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter  @Builder
@AllArgsConstructor @NoArgsConstructor

@SequenceGenerator(
        name = "POST_SEQ_GENERATOR",
        sequenceName = "POST_SEQ",
        initialValue = 1, allocationSize = 1)

public class Post {

    @Id  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "POST_SEQ_GENERATOR")
    @Column(name = "post_id")
    private String id;

    @ManyToOne
//    @Column(name = "user_id")
    @JoinColumn(name = "user_id")
    private User userId;

    @NotNull
    private String title;

    @NotNull
    private String content;

    private Integer hit;

    @Column(name = "renew_day")
    private LocalDateTime renew;

    @NotNull
    private String category;

}
