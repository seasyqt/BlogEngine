package ru.skillbox.blog.model;

import lombok.Data;
import ru.skillbox.blog.model.enums.ModerationStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false, name = "is_active")
    private byte isActive;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "ENUM('NEW', 'ACCEPTED', 'DECLINED')", name = "moderation_status")
    private ModerationStatus moderationStatus;

    @ManyToOne
    @JoinColumn(name = "moderator_id")
    private User moderator;

    @ManyToOne
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

    @Column(nullable = false)
    private LocalDateTime time;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false, name = "view_count")
    private int viewCount;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "tag2post",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<Tag> tags;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PostComment> postComments;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PostVote> postVotes;
}
