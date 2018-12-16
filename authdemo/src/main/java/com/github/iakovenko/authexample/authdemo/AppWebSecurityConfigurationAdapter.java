package com.github.iakovenko.authexample.authdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @autor iakovenko
 * @company Printec LLC
 * 12.12.2018
 */
@Configuration
public class AppWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {

    @Autowired
    private DaoAuthenticationProvider authenticationProvider;


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider);
    }

    protected  void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/api/main")
                .permitAll()
                .antMatchers("/api/user")
                .hasRole("USER")
                .antMatchers("/api/admin")
                .hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .csrf().disable()
                .httpBasic();
    }
}
