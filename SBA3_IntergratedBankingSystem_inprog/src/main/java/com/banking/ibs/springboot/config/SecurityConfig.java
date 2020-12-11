package com.banking.ibs.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	
	// configure the credential 
	//@Override
	/*protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// 1. in-memory auth : create hard-coded user (credential)
		// 2. jdbcauthentication : database authentication
		// 3. ldap-server : remote config
		
		// in-memory auth
		// create User
		UserBuilder builder = User.withDefaultPasswordEncoder();
		// register that we want to use in-memory auth
		auth.inMemoryAuthentication()
			.withUser(builder.username("user").password("123").roles("USER"))
			.withUser(builder.username("admin").password("123").roles("ADMIN"));
	}
	*/
	// configure the rules
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.httpBasic().disable();
		http.formLogin().disable();
		
		// spring security auto maintains sessions
		/*http.authorizeRequests()  // start defining rule
			.antMatchers("/user/**").hasRole("USER")
			.antMatchers("/admin/**").hasRole("ADMIN")
			.anyRequest() // every url is secured
			.authenticated()
		.and() // how auth should take place
			// .httpBasic();
			.formLogin() // form based auth
			//.loginPage("/") // url of custom login page/handler : custom login form auth
			//.loginProcessingUrl("/validate")  // in-built handler will be provided (free of cost)
			//.permitAll()
		.and()
			.logout().permitAll() // inbuilt handler method (by default url /logout)
		.and()
			.exceptionHandling()
				.accessDeniedPage("/access-denied"); // custom access denied page/handler
			*/
	}
}











