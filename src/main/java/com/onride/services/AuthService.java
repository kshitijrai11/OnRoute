package com.onride.services;

import com.onride.dto.DriverDto;
import com.onride.dto.SignupDto;
import com.onride.dto.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);

}
