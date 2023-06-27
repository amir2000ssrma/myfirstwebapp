package com.example.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username , String password){
        boolean IsValidUserName = username.equalsIgnoreCase("amir2000ssrma");
        boolean IsValidPassword = password.equalsIgnoreCase("madrid");

        return IsValidPassword && IsValidUserName;
    }
}
