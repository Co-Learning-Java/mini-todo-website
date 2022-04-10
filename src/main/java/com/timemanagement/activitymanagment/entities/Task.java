package com.timemanagement.activitymanagment.entities;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
@ToString
@Entity
@Data
@Table
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;
}
