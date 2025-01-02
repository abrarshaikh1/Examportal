package com.examportal.Examportal.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "role")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;

    @Column(name = "role")
    private String role;

    @ManyToMany(mappedBy = "roles",cascade = CascadeType.ALL)
    private Set<User> users= new HashSet<>();
}
