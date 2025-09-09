package com.test.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Value("${address.url}")
	private String addressUrl;
        
    public String getAddress() {
        RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = addressUrl+"/address";
		System.out.println(addressUrl);
		ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
        return response.getBody();
    }
}
