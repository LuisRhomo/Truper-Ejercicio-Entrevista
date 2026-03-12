package com.truper.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table (name = "sucursal")
@Data
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    private String name;

    @OneToMany
    private List<Order> orders;
}
