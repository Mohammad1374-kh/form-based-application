package com.example.formbasedlogin.repository;

import com.example.formbasedlogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {
    User findByEmail(String email);
}
