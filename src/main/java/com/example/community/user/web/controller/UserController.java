package com.example.community.user.web.controller;

import com.example.community.user.application.dto.request.CreateUserRequest;
import com.example.community.user.application.dto.response.GetUserResponse;
import com.example.community.user.application.service.UserDetailService;
import com.example.community.user.application.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "유저 API", description = "유저 관련 api 입니다.")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public GetUserResponse getUser(@PathVariable("id") Integer id) {
        return null;
//        return userService.getUser(id);
    }

    @PostMapping("/user")
    public String signUp(@RequestBody CreateUserRequest request) {
        userService.save(request);
        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logOut(HttpServletRequest request, HttpServletResponse response){
        new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder.getContext().getAuthentication());
        return "redirect:/login";
    }
}
