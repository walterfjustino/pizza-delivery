package com.api.pizzadelivery.orders.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentType {

    CREDIT_CARD("Credit-Card"),
    DEBIT_CARD("Debit-Card"),
    MONEY("Money");

    private String description;


}
