package com.adballon.capstone.domain;

import com.adballon.capstone.util.AlarmTypes;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter @Builder
@AllArgsConstructor @NoArgsConstructor
public class Alarm {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alarm_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id")
//    @Column(name = "user_id")
    private User userId;

    private AlarmTypes alarmTypes;

    private String msg;

    @Column(name = "create_date")
    private LocalDateTime date;

    @Column(name = "read_or_not")
    private boolean read;

}
