package com.example.community.user.domain.repository;

import com.example.community.user.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//    Optional<User> findById(Integer id);
    Optional<User> findByLogInId(String logInId);
    Boolean existsByLogInId(String logInId);
    Boolean existsByEmail(String email);
    User save(User user);
}
