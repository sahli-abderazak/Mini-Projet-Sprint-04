package com.abderazak.film;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.abderazak.film.entities.Film;
import com.abderazak.film.entities.Role;
import com.abderazak.film.entities.User;
import com.abderazak.film.service.FilmService;
import com.abderazak.film.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class FilmApplication implements CommandLineRunner{

//	@Autowired
//	FilmService filmService;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserService userService;
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(FilmApplication.class, args);
	}
//
//	@PostConstruct
//	void init_users() {
//	//ajouter les rôles
//	userService.addRole(new Role(null,"ADMIN"));
//	userService.addRole(new Role(null,"AGENT"));
//	userService.addRole(new Role(null,"USER"));
//	//ajouter les users
//	userService.saveUser(new User(null,"admin","123",true,null));
//	userService.saveUser(new User(null,"abderazak","123",true,null));
//	userService.saveUser(new User(null,"user1","123",true,null));
//	//ajouter les rôles aux users
//	userService.addRoleToUser("admin", "ADMIN");
//	userService.addRoleToUser("abderazak", "USER");
//	userService.addRoleToUser("abderazak", "AGENT");
//	userService.addRoleToUser("user1", "USER");
//	}
	
	@Override
	public void run(String... args) throws Exception {
//		filmService.saveFilm(new Film("aka", 4.0, new Date()));
//		filmService.saveFilm(new Film("that's my boy", 2.0, new Date()));
//		filmService.saveFilm(new Film("the body", 3.0, new Date()));
//		System.out.println("Password Encoded BCRYPT :******************** ");
//		 System.out.println(passwordEncoder.encode("123"));
		repositoryRestConfiguration.exposeIdsFor(Film.class);
	}

}
