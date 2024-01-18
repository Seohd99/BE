package com.adballon.capstone.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter  @Builder
@AllArgsConstructor @NoArgsConstructor
public class Report {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "target_id")
//    @Column(name = "user_id")
    private User userId;

    private String content;

    @Column(name = "report_date")
    private LocalDateTime date;

}
