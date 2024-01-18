package com.adballon.capstone.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter  @Builder
@AllArgsConstructor @NoArgsConstructor
public class Image {

    @Id @ManyToOne
    @JoinColumn(name = "post_id")
//    @Column(name = "post_id")
    private Post postId;

    @Id @ManyToOne
    @JoinColumn(name = "file_id")
//    @Column(name = "file_id")
    private File fileId;

}
