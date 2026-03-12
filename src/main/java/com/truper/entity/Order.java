package com.truper.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "ordenes")
@Data
public class Order {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "orderId" , nullable = false)
    private Integer id;
    private LocalDate date;
    private Double total;

    @OneToMany
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;
}
