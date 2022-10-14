package com.example.formbasedlogin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    @NotEmpty(message = "First name should not be empty")
    @Size(min = 2,max = 32,message = "First name must be between 2 and 32 chars")
    private String firstName;

    @NotEmpty(message = "Last name should not be empty")
    @Size(min = 2,max = 32,message = "Last name must be between 2 and 32 chars")
    private String lastName;

    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;

    @NotEmpty(message = "Password should be empty")
    @Size(min = 4,max = 16,message = "Password must be between 4 and 16 chars")
    private String password;

}
