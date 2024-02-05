package com.sagility.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {

	@Bean
	SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(req -> 
		req.antMatchers("/contact")
		.permitAll()
		.anyRequest()
		.authenticated()
		).formLogin();

		System.out.println("security Filter Called...");

		return http.build();
	}

}
