package com.api.pizzadelivery.users.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityExistsException;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserAlreadyExistsException extends EntityExistsException {

    public UserAlreadyExistsException(String name,String email) {

        super(String.format("User with name %s or email %S already exists!", name, email));

    }

   }
