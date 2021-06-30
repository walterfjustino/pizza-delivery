/*
package com.api.pizzadelivery.restaurants.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.Email;

import com.api.pizzadelivery.entity.Auditable;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
public class Restaurant extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    @Email
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String cnpj;

    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime createdDate;

    @Column(nullable = false)
    private String contact;

    @OneToMany(mappedBy = "orders",cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Order order;
    
}
*/
