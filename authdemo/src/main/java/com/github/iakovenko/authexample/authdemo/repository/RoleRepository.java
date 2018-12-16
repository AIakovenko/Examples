package com.github.iakovenko.authexample.authdemo.repository;

import com.github.iakovenko.authexample.authdemo.entity.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * @autor iakovenko
 * @company Printec LLC
 * 12.12.2018
 */
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
