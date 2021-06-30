package com.api.pizzadelivery.users.exception;

import javax.persistence.EntityExistsException;

public class UserEmailAlreadyExistsException extends EntityExistsException {

    public UserEmailAlreadyExistsException(String email) {
        super(String.format("User with e-mail %s already exists!", email));
    }
}
