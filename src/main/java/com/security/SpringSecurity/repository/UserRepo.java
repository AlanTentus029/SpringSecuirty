package com.security.SpringSecurity.repository;

import com.security.SpringSecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserRepo extends JpaRepository<Users, Long > {

    Users findByUsername(String username);


}
