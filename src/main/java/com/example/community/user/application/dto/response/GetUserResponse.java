package com.example.community.user.application.dto.response;

import com.example.community.user.domain.entity.UserStatus;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class GetUserResponse {
    private Integer id;
    private String logInId;
    private String name;
    private String nickName;
    private String email;
    private String phoneNumber;
    private LocalDate birthDate;
    private String gender;
    private UserStatus userStatus;
}
