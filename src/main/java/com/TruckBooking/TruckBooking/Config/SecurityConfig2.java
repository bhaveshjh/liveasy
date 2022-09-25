package com.TruckBooking.TruckBooking.Config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

//
//
public class SecurityConfig2 extends WebSecurityConfigurerAdapter{


	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		// dont authenticate this particular request
		.authorizeRequests().antMatchers("/**").permitAll()
		.and()
		// make sure we use stateless session; session won't be used to store user's state.
		.sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
	}
