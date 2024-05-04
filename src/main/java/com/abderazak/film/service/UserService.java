package com.abderazak.film.service;

import com.abderazak.film.entities.Role;
import com.abderazak.film.entities.User;

public interface UserService {
	void deleteAllusers();
	void deleteAllRoles();
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}
