package com.peerLending.securityapp;

import com.peerLending.securityapp.user.model.User;
import com.peerLending.securityapp.user.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SecurityAppApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		userRepository.save(new User("Heseltine", "123456"));
		userRepository.save(new User("Gwiyo", "123456"));
		userRepository.save(new User("Sara", "123456"));

	}
}
