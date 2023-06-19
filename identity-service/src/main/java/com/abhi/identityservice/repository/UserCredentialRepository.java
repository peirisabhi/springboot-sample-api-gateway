package com.abhi.identityservice.repository;

import com.abhi.identityservice.entity.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 15/06/2023
 * Time: 08:42
 */
@Repository
public interface UserCredentialRepository extends JpaRepository<UserCredential, Integer> {
    Optional<UserCredential> findByName(String username);
}
