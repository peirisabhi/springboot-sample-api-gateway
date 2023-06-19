package com.abhi.identityservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 15/06/2023
 * Time: 08:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {

    private String username;

    private String password;
}
