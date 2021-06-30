/*
package com.api.pizzadelivery.orders.entity;

import javax.persistence.*;

import com.api.pizzadelivery.entity.Auditable;
import com.api.pizzadelivery.orders.enums.PaymentType;
import com.api.pizzadelivery.pizzas.entity.Pizza;
import com.api.pizzadelivery.restaurants.entity.Restaurant;
import com.api.pizzadelivery.users.entity.User;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;


@Data
@Entity
public class Order extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @OneToMany(mappedBy = "user")
    @Column(nullable = false, unique = true)
    private User user;

    @Column(nullable = false, unique = true)
    private Pizza pizza;

    @Column(nullable = false)
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentType paymentType;

    @Column(length = 200)
    private String observation;

    @Column(nullable = false)
    private Restaurant restaurant;

}
*/
