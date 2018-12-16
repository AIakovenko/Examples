package com.github.iakovenko.authexample.authdemo.repository;

import com.github.iakovenko.authexample.authdemo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @autor iakovenko
 * @company Printec LLC
 * 12.12.2018
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    UserDetails getUserByUsername(String username);
}
