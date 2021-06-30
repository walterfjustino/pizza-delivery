package com.api.pizzadelivery.pizzas.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String pizzaName;

    @Column(nullable = false)
    private String ingredients;

    @Column(nullable = false)
    private BigDecimal price;


}
