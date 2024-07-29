package com.project.uber.UberApp.entities;

import com.project.uber.UberApp.entities.enums.Role;
import com.sun.source.doctree.EscapeTree;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "app_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Sequence is used when we are using any batch oprns
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;
    private String password;

    @ElementCollection(fetch = FetchType.LAZY) //it will create another table specifically for Roles only because we are
    //SQL DB and a  row in SQL contains only one value...so in order to save Set of Roles, we need a normalised format table
    @Enumerated(EnumType.STRING) //it says that we are going to use the Enum types in string format only
    private Set<Role> roles;
}
