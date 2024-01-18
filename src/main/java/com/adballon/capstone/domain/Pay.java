package com.adballon.capstone.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter  @Builder
@AllArgsConstructor @NoArgsConstructor
public class Pay {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pay_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id")
//    @Column(name = "user_id")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "target_id")
//    @Column(name = "target_id")
    private User targetId;

    @Column(name = "pay_type")
    private String pay_type;

    private String amount;

    @Column(name = "pay_way")
    private String way;

    private String content;

    private String goods;

    @Column(name = "contract_date")
    private LocalDateTime date;

}
