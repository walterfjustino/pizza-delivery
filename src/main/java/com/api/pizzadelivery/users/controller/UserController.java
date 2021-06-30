package com.api.pizzadelivery.users.controller;


import com.api.pizzadelivery.users.dto.UserDTO;
import com.api.pizzadelivery.users.entity.User;
import com.api.pizzadelivery.users.service.CreateUserServiceImpl;
import com.api.pizzadelivery.users.service.GetUserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final CreateUserServiceImpl createUserServiceImpl;
    private final GetUserServiceImpl getUserServiceImpl;


    @PostMapping
    public ResponseEntity <UserDTO> save (@RequestBody @Valid UserDTO userDTO){
        UserDTO user = createUserServiceImpl.save(userDTO);
    return new ResponseEntity<>((user), HttpStatus.CREATED);
    }

   @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
    User user = getUserServiceImpl.findById(id);
    return new ResponseEntity<>((user),HttpStatus.OK);

    }

/*    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody @Valid UserDTO userDTO) {
        User user = createUserServiceImpl.save(userDTO);
        return user;
    }*/
/*
    @GetMapping("/")
    public ResponseEntity<List<User>> findAll() {

        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
    }

   *//* public ResponseEntity<List<Curso>> listar() {
        return new ResponseEntity<List<Curso>>(new ArrayList<Curso>(cursos.values()), HttpStatus.OK);
    }*//*

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> findById(@PathVariable Long id) {

        return new ResponseEntity<>(UserResponseDTO.modelToDTO(user.get()), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDTO> update(@RequestBody UserDTO dto){

        return new ResponseEntity<>(UserResponseDTO.modelToDTO(user),HttpStatus.OK);

    }*/
}

