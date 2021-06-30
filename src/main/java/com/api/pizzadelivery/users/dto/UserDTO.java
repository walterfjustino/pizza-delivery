package com.api.pizzadelivery.users.dto;

import com.api.pizzadelivery.users.entity.User;


import lombok.*;

import javax.validation.constraints.*;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;

    @NotBlank(message = "{name.not.blank}")
    @Size(min = 3, max = 255)
    private String name;

    @NotBlank(message = "{email.not.blank}")
    @Email
    private String email;


    @NotBlank(message = "{password.not.blank}")
    @Size(min = 8, max = 15)
    private String password;

   /* *//*@NotEmpty
    private Order order;*//*

    public User modelToObject(){
        return new User( name, email, password);
        
    }*/
}
