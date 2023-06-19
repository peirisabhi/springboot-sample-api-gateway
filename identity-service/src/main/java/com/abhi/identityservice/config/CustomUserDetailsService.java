package com.abhi.identityservice.config;

import com.abhi.identityservice.entity.UserCredential;
import com.abhi.identityservice.repository.UserCredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 15/06/2023
 * Time: 15:27
 */

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserCredentialRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserCredential> credential = repository.findByName(username);
        return credential.map(CustomUserDetails::new).orElseThrow(() -> new UsernameNotFoundException("user not found with name :" + username));
    }
}
