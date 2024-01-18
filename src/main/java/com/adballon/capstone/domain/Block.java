package com.adballon.capstone.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter @Builder
@AllArgsConstructor @NoArgsConstructor
public class Block {

    @Id @ManyToOne
    @JoinColumn(name = "user_id")
//    @Column(name = "user_id")
    private User id;

    @Id @ManyToOne
    @JoinColumn(name = "user_id")
    private User targetId;

    @Column(name = "block_date")
    private LocalDateTime date;

}
