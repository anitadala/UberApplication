package com.project.uber.UberApp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Rider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne //this one to one mapping will map your one user to one rider, it will define unique constraint itself
    @JoinColumn(name = "user_id") //The Rider table will have a column as "user_id" and this user_id will actually be the
    //foreign key for user [Primary key for user]
    private User user;

    private Double rating;
}
