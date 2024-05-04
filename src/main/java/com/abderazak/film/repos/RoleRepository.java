package com.abderazak.film.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abderazak.film.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);
}
