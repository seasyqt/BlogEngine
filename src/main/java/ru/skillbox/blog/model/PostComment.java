package ru.skillbox.blog.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "post_comments")
public class PostComment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private PostComment parent;

    @ManyToOne
    @JoinColumn(nullable = false, name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

    @Column(nullable = false)
    private LocalDateTime time;

    @Column(nullable = false)
    private String text;

}
