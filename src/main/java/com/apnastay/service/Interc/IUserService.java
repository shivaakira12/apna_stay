package com.apnastay.service.Interc;

import com.apnastay.dto.LoginRequest;
import com.apnastay.dto.Response;
import com.apnastay.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
