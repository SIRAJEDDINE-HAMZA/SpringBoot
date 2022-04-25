package com.example.ProjetControle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.example.ProjetControle.entity"})
@EnableAutoConfiguration
@EnableJpaRepositories("com.example.ProjetControle.repository")
@ComponentScan({"com.example.ProjetControle.controller", "com.example.ProjetControle.service"})
public class ProjetControleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetControleApplication.class, args);
	}

}
