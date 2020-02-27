package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication().withUser("raj").password("123").roles("user")
		.and()
		.withUser("chandu").password("123").roles("admin");
	}

	@Bean
	public PasswordEncoder getPasswordEmcoder() {
		return NoOpPasswordEncoder.getInstance();
	}  
    
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 http.authorizeRequests().antMatchers("/").permitAll()
		.antMatchers("/user").hasRole("user")
		.antMatchers("/admin").hasRole("admin")
		.and().formLogin();
		// TODO Auto-generated method stub
	}
}
