package com.github.iakovenko.authexample.authdemo.service;

import com.github.iakovenko.authexample.authdemo.entity.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * @autor iakovenko
 * @company Printec LLC
 * 12.12.2018
 */
@Service
public class PrincipalService {

    public String getPrincipalName(){
        String principalName;
        try {
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            if (principal instanceof UserDetails) {
                principalName = ((UserDetails)principal).getUsername();
            } else {
                principalName = principal.toString();
            }
            if (principalName.equals("anonymousUser")){
                principalName = "UNAUTHORIZED";
            }

        } catch (NullPointerException e ) {
            principalName = "UNAUTHORIZED";
        }
        return principalName;
    }

    public User getUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            return (User)auth.getPrincipal();
        } else {
            return  null;
        }
    }
}
