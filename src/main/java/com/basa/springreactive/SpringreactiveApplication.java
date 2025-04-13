package com.basa.springreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringreactiveApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/springreactive");
		SpringApplication.run(SpringreactiveApplication.class, args);
	}
}
