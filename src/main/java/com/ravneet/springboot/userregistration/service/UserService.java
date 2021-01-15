package com.ravneet.springboot.userregistration.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ravneet.springboot.userregistration.model.User;
import com.ravneet.springboot.userregistration.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	User findByEmail(String email);
	
	User save(UserRegistrationDto registration);
}
