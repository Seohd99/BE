package com.adballon.capstone.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter @Builder
@AllArgsConstructor @NoArgsConstructor
public class Review {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id")
//    @Column(name = "user_id")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "target_id")
//    @Column(name = "target_id")
    private User targetId;

    private String content;

    private Integer grade;

    @Column(name = "create_date")
    private LocalDateTime date;

}
