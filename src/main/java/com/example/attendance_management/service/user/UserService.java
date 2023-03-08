package com.example.attendance_management.service.user;

import com.example.attendance_management.dto.UserJoinDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void register(UserJoinDto userJoinDto);

}
