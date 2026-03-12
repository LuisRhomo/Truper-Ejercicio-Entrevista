package com.truper.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table( name = "product")
@Data
public class Product {

    @Id
    @Column(nullable = false)
    private Integer id;
    private String code;
    private String description;
    private Double price;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

}
