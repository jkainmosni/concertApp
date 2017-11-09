package com.codingSchool.carWebApp.Converters;

import com.codingSchool.carWebApp.Domain.User;
import com.codingSchool.carWebApp.Model.RegistrationForm;


public class UserConverter {

    public static User buildUserObject(RegistrationForm registrationForm) {
        User user = new User();
        user.setPassword(registrationForm.getPassword());
        user.setEmail(registrationForm.getEmail());
        user.setFirstname(registrationForm.getFirstname());
        user.setLastname(registrationForm.getLastname());
        return user;
    }
}
