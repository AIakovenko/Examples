package com.github.iakovenko.authexample.authdemo.service;

import com.github.iakovenko.authexample.authdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @autor iakovenko
 * @company Printec LLC
 * 12.12.2018
 */
@Service
public class AppUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetails userDetails = userRepository.getUserByUsername(s);
        if (userDetails == null){
            throw  new UsernameNotFoundException("User " + s + " not found");
        }
        return userDetails;
    }
}
