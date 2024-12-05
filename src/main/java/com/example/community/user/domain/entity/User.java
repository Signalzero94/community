package com.example.community.user.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Integer userGradeId;
    private String logInId;
    private String password;
    private String name;
    private String nickName;
    private String email;
    private String phoneNumber;
    private LocalDate birthDate;
    private String gender;
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;
}
