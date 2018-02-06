package com.security.client;

import org.springframework.web.client.RestTemplate;

public class UserRegistration {
	public static void main(String[] args) {
		RestTemplate template=new RestTemplate();
		String url="";
		User user=new User();
		user.setName("Dharmendra");
		user.setUserId(1001);
		user.setPost("SE");
		String status=template.getForObject(url, String.class, user);
		System.out.println(status);
	}

}
