package com.codingSchool.carWebApp.Services;

import com.codingSchool.carWebApp.Exceptions.InvalidCredentialsException;
import com.codingSchool.carWebApp.Repositories.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    private final static org.slf4j.Logger LOG = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void login(String username, String password) throws AuthenticationException {

        try {
            userRepository.findByUsernameAndPassword(username, password);
        } catch (Exception e) {
            throw new InvalidCredentialsException("User not found!");
        }
    }

}
