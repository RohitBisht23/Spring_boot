package com.learningSpringBoot.rohit.firstTime.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

	@Autowired
	Apple appleObj;
	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		appleObj.eat();
	}
}
