package com.api.pizzadelivery.pizzas.repository;

import com.api.pizzadelivery.pizzas.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
