package com.github.iakovenko.authexample.authdemo.controller;

import com.github.iakovenko.authexample.authdemo.entity.User;
import com.github.iakovenko.authexample.authdemo.service.PrincipalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autor iakovenko
 * @company Printec LLC
 * 12.12.2018
 */
@RestController
public class MainRestController {

    @Autowired
    private PrincipalService principalService;

    @GetMapping("api/main")
    public String main(){
        return "Main OK";
    }

    @GetMapping("api/user")
    public String user(){
        User user = principalService.getUser();
        return "Logged  in as user '" + user.getUsername() + "', email '" + user.getEmail() + "'";
    }

    @GetMapping("api/admin")
    public String admin(){
        User user = principalService.getUser();
        return "Logged  in as admin '" + user.getUsername() + "', email '" + user.getEmail() + "'";
    }
}
