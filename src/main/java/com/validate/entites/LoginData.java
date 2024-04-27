package com.validate.entites;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginData {

    @NotBlank(message = "User Name can not be empty !!")
    @Size(min=3,max=12 ,message = "User name must be between 3-12 character")
    private String userName;


    @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"
            )
    private String email;

    @AssertTrue(message = "Must agree terms and conditions")
    private boolean agreed;
}
