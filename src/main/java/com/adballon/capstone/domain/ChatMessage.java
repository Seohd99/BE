package com.adballon.capstone.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter  @Builder
@AllArgsConstructor @NoArgsConstructor
@Table(name = "Chat_message")
public class ChatMessage {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "msg_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "sender_id")
//    @Column(name = "sender_id")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "chat_id")
//    @Column(name = "chat_id")
    private User targetId;

    private String msg;

    @Column(name = "create_date")
    private LocalDateTime date;

    @Column(name = "read_or_not")
    private boolean read;


}
