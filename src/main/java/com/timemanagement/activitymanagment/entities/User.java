package com.timemanagement.activitymanagment.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullName;
    @Column(unique = true)
    private String userName;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
   // @JoinColumn(name = "tasks", referencedColumnName = "id")
    private List<Task> tasks = new ArrayList<>();
}
