package com.api.pizzadelivery.users.entity;



import com.api.pizzadelivery.entity.Auditable;
import lombok.*;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User  {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name ;

    @Column(nullable = false)
    private String email ;

    @Column(nullable = false)
    private String password ;

    @Column(nullable = false)
    private boolean admin = false;

 /* public User(String name, String email, String password) {
      this.name = name;
      this.email = email;
      this.password = password;
}*/

}



