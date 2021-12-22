package ru.skillbox.blog.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "post_votes")
public class PostVote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(nullable = false, name = "post_id")
    private Post post;

    @Column(nullable = false)
    private LocalDateTime time;

    @Column(nullable = false)
    private byte value;

}
