package com.abderazak.film.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.abderazak.film.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}
