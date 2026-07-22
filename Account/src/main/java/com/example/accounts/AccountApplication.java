package com.example.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.accounts.dto.AccountsContactInfoDto;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(AccountsContactInfoDto.class)
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "Anubhav's Account Microservice Project",
				version = "v1",
				contact = @Contact(
						name="Anubhav Kundu",
						email="akundu.anp@gmail.com",
						url="www.tcs.com"
				),
				license = @License(
						name="Apache 2.0",
						url="www.tcs.com"
				)			
				
		),
		externalDocs = @ExternalDocumentation(
				 description = "Anubhav's Accounts microservice REST API Documentation",
				 url="http://localhost:8080/swagger-ui/index.html"
				)
)
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

}
