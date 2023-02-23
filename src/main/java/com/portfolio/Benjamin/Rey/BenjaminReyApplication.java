package com.portfolio.Benjamin.Rey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.portfolio.Benjamin.Rey")
@EnableJpaRepositories(basePackages = "Repository")
@EntityScan(basePackages = "Entity")
public class BenjaminReyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BenjaminReyApplication.class, args);
	}

}
