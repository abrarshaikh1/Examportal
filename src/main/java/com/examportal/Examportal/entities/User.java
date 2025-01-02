package com.examportal.Examportal.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "username")
    private String userName;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private Long phone;

    @ManyToMany
    @JoinTable(
            name = "user_roles", // Join table name
            joinColumns = @JoinColumn(name = "user_id"), // Foreign key column for User entity
            inverseJoinColumns = @JoinColumn(name = "role_id") // Foreign key column for Role entity
    )
    private Set<Role> roles = new HashSet<>();;
    @Column(name = "useractive")
    private Boolean userActive=true;

}
