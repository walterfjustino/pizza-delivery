package com.api.pizzadelivery.users.exception;

import javax.persistence.EntityExistsException;

public class UserAlreadyExistsException extends EntityExistsException {

    public UserAlreadyExistsException(String name) {
    }
}
