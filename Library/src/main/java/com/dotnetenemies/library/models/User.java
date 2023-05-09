package com.dotnetenemies.library.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "LIB_User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    String name;

    @Column
    String login;

    @Column
    String password;

}
