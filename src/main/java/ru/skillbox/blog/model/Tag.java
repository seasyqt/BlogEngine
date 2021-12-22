package ru.skillbox.blog.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tags")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String name;

}
