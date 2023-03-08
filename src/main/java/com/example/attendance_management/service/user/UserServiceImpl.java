package com.example.attendance_management.service.user;

import com.example.attendance_management.domain.enums.Position;
import com.example.attendance_management.domain.enums.Role;
import com.example.attendance_management.domain.user.User;
import com.example.attendance_management.domain.user.UserRepository;
import com.example.attendance_management.dto.UserJoinDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements  UserService {

    private final UserRepository userRepository;

    @Override
    public void register(UserJoinDto userJoinDto) {
        User user = User.builder()
                .id(null)
                .name(userJoinDto.getName())
                .username(userJoinDto.getUsername())
                .password(userJoinDto.getPassword())
                .department(userJoinDto.getDepartment())
                .position(userJoinDto.getPosition())
                .role(Role.USER.getKey())
                .approval(false)
                .build();
    }
}
