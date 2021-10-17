package com.peerlender.lendingengine;

import com.peerlender.lendingengine.domain.model.User;
import com.peerlender.lendingengine.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LendingengineApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(LendingengineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Heseltine", "Heseltine", "Tutu", 30, "Software Developer"));
		userRepository.save(new User("Gwiyo", "Gwiyo", "Timayo", 21, "Database Administrator"));
		userRepository.save(new User("Sara", "Sara", "Dyipe", 30, "Data Analyst"));
		userRepository.save(new User("Harufa", "Harufa", "Buko", 26, "System Analyst"));
		userRepository.save(new User("Galugalu", "Galugalu", "Basara", 35, "Blockchain Developer"));
		userRepository.save(new User("Manase", "Manase", "Makiso", 41, "Physician"));
		userRepository.save(new User("Dulu", "Dulu", "Kumbuko", 27, "Nurse"));
		userRepository.save(new User("Komora", "Komora", "Chihaa", 37, "Teacher"));
		userRepository.save(new User("Amuma", "Amuma", "Bonaya", 41, "Fisherman"));
		userRepository.save(new User("Chikanda", "Chikanda", "Daido", 51, "Army Cadet"));
		userRepository.save(new User("Amana", "Amana", "Tito", 33, "Teacher"));
		userRepository.save(new User("Daido", "Daido", "Bonaya", 20, "Businessman"));
		userRepository.save(new User("Malika", "Malika", "Ipu", 33, "Surgeon"));





	}
}
