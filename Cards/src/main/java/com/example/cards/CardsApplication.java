package com.example.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.cards.dto.CardsContactInfoDto;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.cards.controller") })
@EnableJpaRepositories("com.eazybytes.cards.repository")
@EntityScan("com.eazybytes.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(CardsContactInfoDto.class)
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "Anubhav's Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Anubhav Kundu",
						email = "akundu.anp@gmail.com",
						url = "https://www.tcs.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.tcs.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Anubhav's Cards microservice REST API Documentation",
				url = "https://www.anubhav.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		
		//docker run -p 3309:3306 --name cardsdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=cardsdb -d mysql:latest
		SpringApplication.run(CardsApplication.class, args);
	}

}
