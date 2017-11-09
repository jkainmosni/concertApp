package com.codingSchool.carWebApp.Services;

import com.codingSchool.carWebApp.Domain.User;
import org.springframework.security.core.AuthenticationException;


public interface AccountService {

    void login(String username, String password) throws AuthenticationException;

}
