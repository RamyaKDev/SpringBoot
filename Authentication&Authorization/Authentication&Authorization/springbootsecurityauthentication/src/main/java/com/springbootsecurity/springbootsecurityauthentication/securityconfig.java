package com.springbootsecurity.springbootsecurityauthentication;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class securityconfig extends WebSecurityConfigurerAdapter{

	@Autowired
	DataSource dataSource;
	
	
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
////		super.configure(auth);
//		
//		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//	    auth.jdbcAuthentication()
//	    .dataSource(dataSource)
//	    .withDefaultSchema()
//	    .withUser("mmmmm")
//	    .password(encoder.encode("password"))
//	    .roles("aaaa")
//	    .and()
//	    .withUser("nnn")
//	    .password(encoder.encode("pass"))
//	    .roles("roles");
//		
//	}
	
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
//		super.configure(auth);
		
		// Generate Encoder for Password
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		
		
		auth.jdbcAuthentication()
		.dataSource(dataSource) // connect with H2 Database
		.withDefaultSchema() // Automatic Table creation
		.withUser("user")  // set username
		.password(encoder.encode("user")) // set password
		.roles("USER")
		.and()
		.withUser("admin")
		.password(encoder.encode("admin"))
		.roles("ADMIN");
		
	}

	// Authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub

		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/admin/").denyAll()
		.antMatchers("/user").hasAnyRole("ADMIN","USER")
		.antMatchers("/").permitAll()
		.antMatchers("h2-console/**").permitAll() 
		.and().formLogin();
		
		// For H2 Database
		http.csrf().disable();
		http.headers().frameOptions().disable();
		
	}
	
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// TODO Auto-generated method stub
////		super.configure(http);
//		
//		http.authorizeRequests()
//		.antMatchers("/mmm").hasAnyRole("aaaa")
//		.antMatchers("/bbb").denyAll()
//		.antMatchers("/cccc").hasAnyRole("aaaa","bbbb")
//		.antMatchers("/asdf").permitAll()
//		.antMatchers("h2-console/***").permitAll()
//		.and().formLogin();
//		
//	}
	

}
