package com.example.community.user.web.controller;

import com.example.community.user.application.dto.response.GetUserResponse;
import com.example.community.user.application.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Tag(name = "유저 API", description = "유저 관련 api 입니다.")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public GetUserResponse getUser(@PathVariable("id") Integer id) {
        return userService.getUser(id);
    }
}
