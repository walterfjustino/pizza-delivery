package com.api.pizzadelivery.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDTO {

    private Long id;

    @NotNull
    @NotBlank
    @Size(min = 4, max = 200, message = "You must enter the name ")
    private String name;
    
    @NotNull
    @Size(min = 4, max = 200, message = "You must enter the email ")
    private String email;
   
    @NotNull
    @NotBlank
    @Size(min = 11, max = 11, message = "You must enter the cnpj ")
    private String cnpj;

    @NotNull
    @NotBlank
    @Size(min = 4, max = 200, message = "You must enter the contact")
    private String contact;

    //@NotNull
    //private OrderDTO order;
    
}
