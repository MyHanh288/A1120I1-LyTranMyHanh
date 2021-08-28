package com.example.demo.model.repository;

import com.example.demo.model.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUserName (String username);
}
