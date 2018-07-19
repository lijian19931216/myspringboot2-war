package com.luying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Myspringboot2WarApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Myspringboot2WarApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Myspringboot2WarApplication.class);
	}
}
