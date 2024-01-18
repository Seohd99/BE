package com.adballon.capstone.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter  @Builder
@AllArgsConstructor @NoArgsConstructor
public class File {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_id")
    private String id;

    private String type;

    private String name;

}
