package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@EnableJpaRepositories(basePackages = "com.example.demo.repository")
@SpringBootApplication
public class DemoApplication {

//	@Autowired
//	private UserRepository userRepository;
//
//	@PostConstruct
//	public void initDB(){
//		List<User> users = new ArrayList<>();
//		users.add(new User(1,"ime1", "pass1", "adresa1"));
//		users.add(new User(2,"ime2", "pass2", "adresa2"));
//		users.add(new User(3,"ime3", "pass3", "adresa3"));
//
//		userRepository.saveAll(users);
//	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
