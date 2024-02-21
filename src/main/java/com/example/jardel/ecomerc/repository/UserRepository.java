package com.example.jardel.ecomerc.repository;

import com.example.jardel.ecomerc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
