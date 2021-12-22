package ru.skillbox.blog.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "global_settings")
public class GlobalSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String value;

}
