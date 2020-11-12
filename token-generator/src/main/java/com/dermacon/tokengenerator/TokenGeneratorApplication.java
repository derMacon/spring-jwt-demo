package com.dermacon.tokengenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class TokenGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TokenGeneratorApplication.class, args);

//		PasswordEncoder encoder = new BCryptPasswordEncoder();
//		String s = "testpw";
//
////		for (int i = 0; i < 5; i++) {
////			System.out.println(encoder.encode(s));
////		}
//
//		System.out.println(encoder.matches(s, "$2a$10$I.JhpTepEehPc.1tyLwPjuy3i1vFJr8lLd4/U6xUjqCfz7/2arWFG"));

	}

}
