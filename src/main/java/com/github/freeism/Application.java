package com.github.freeism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private PersonJpaRepository personJpaRepository;
	@Autowired
	private WishJpaRepository wishJpaRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(">>> " + personJpaRepository.findAll());
		System.out.println(">>> " + wishJpaRepository.findAll());
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
