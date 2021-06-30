/*
package com.api.pizzadelivery.users.controller;

import com.api.pizzadelivery.users.builder.UserDTOBuilder;
import com.api.pizzadelivery.users.dto.UserDTO;
import com.api.pizzadelivery.users.service.UserService;
import com.api.pizzadelivery.utils.JsonConversionUtils;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.core.MethodParameter;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableArgumentResolver;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    private MockMvc mockMvc;

    private UserDTOBuilder userDTOBuilder;


    @BeforeEach
    void setUp() {
        userDTOBuilder = UserDTOBuilder.builder().build();
        mockMvc = MockMvcBuilders.standaloneSetup(userController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setViewResolvers((s,locale) -> new MappingJackson2JsonView())
                .build();

    }

    @Test
    void whenPOSTIsCalledThenStatusCreatedShouldBeReturn() throws Exception {
       UserDTO expectedCreatedUserDTO = userDTOBuilder.buildUserDTO();

        Mockito.when(userService.create(expectedCreatedUserDTO))
                .thenReturn(expectedCreatedUserDTO);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JsonConversionUtils.asJsonString(expectedCreatedUserDTO)))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Is.is(expectedCreatedUserDTO.getId().intValue())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name", Is.is(expectedCreatedUserDTO.getName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email", Is.is(expectedCreatedUserDTO.getEmail())));

    }


}*/
