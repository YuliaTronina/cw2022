package ru.student.cw2022.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private long id;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty (message = "Email should not be empty")
    @Email
    private String email;

    @NotEmpty (message = "Password should not be empty")
    private String password;
}