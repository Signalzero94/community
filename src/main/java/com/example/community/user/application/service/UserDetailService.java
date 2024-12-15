package com.example.community.user.application.service;

import com.example.community.user.application.dto.response.GetUserResponse;
import com.example.community.user.domain.entity.User;
import com.example.community.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByLogInId(username).orElseThrow(()-> new UsernameNotFoundException(username));
    }
}
