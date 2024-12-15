package com.example.community.user.application.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateUserRequest {
    private String logInId;
    private String password;
    private String name;
    private String nickName;
    private String email;
    private String phoneNumber;
    private LocalDate birthDate;
    private String gender;
}
