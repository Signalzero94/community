package com.example.community.user.application.service;

import com.example.community.user.application.dto.response.GetUserResponse;
import com.example.community.user.domain.entity.User;
import com.example.community.user.domain.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public GetUserResponse getUser(Integer id) {
        User findUser = userRepository.findById(id).orElseThrow(()->new IllegalArgumentException("존재하지 않는 유저입니다."));
        return GetUserResponse.builder()
                .id(findUser.getId())
                .name(findUser.getName())
                .email(findUser.getEmail())
                .userStatus(findUser.getUserStatus())
                .gender(findUser.getGender())
                .logInId(findUser.getLogInId())
                .nickName(findUser.getNickName())
                .phoneNumber(findUser.getPhoneNumber())
                .birthDate(findUser.getBirthDate())
                .build();
    }
}
