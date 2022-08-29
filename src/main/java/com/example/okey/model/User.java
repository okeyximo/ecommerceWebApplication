package com.example.okey.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(nullable = false, unique = true)
    @Email(message = "{errors.invalid_email}")
    private String email;
    @NotEmpty
    private String password;
    @NotEmpty
    @Column(nullable = false)
    private String firstname;
    private String lastname;


}
