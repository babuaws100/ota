package com.test.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@Component
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Value("${address.url}")
	private String addressUrl;

	@GetMapping("/user")
	public String getUser() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = addressUrl+"/address";
		System.out.println(addressUrl);
		ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
		return response.getBody();
	}
}
