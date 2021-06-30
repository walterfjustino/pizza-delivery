package com.api.pizzadelivery.users.repository;

import com.api.pizzadelivery.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQueries;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional <User> findByNameOrEmail(String name, String email);

    Optional <User> findByName(String name);

    Optional <User> findByEmail(String email);

}
