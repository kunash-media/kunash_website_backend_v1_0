package com.kunash_web.service;

import com.kunash_web.dto.request.LoginRequest;
import com.kunash_web.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse authenticateUser(LoginRequest loginRequest);
}