package com.adballon.capstone.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter @Builder
@AllArgsConstructor @NoArgsConstructor
public class Chat {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id")
//    @Column(name = "user_id")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "target_id")
//    @Column(name = "target_id")
    private User targetId;

    @Column(name = "create_date")
    private LocalDateTime date;

}
