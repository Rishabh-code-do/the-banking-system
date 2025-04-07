package com.rishabh.the_banking_system;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "The Banking SYSTEM",
				description = "Backend Rest API's for Bank",
				contact = @Contact(
						name = "Rishabh Jaiswal",
						email = "rishabh@gmail.com"
				)
		)
)
public class TheBankingSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(TheBankingSystemApplication.class, args);
	}

}
