package com.example.attendance_management.config;

import com.example.attendance_management.domain.user.Member;
import com.example.attendance_management.domain.user.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Slf4j
@Component
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Member> userOpt = memberRepository.findByUsername(username);

        if (userOpt.isPresent()) {
            log.info("USER FOUND IN THE DATABASE: {}", username);

            Member user = userOpt.get();
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();

            authorities.add(new SimpleGrantedAuthority(user.getRole()));

            return new User(user.getUsername(), user.getPassword(), authorities);
        } else {
            log.error("USER NOT FOUND IN THE DATABASE");

            throw new UsernameNotFoundException("USER NOT FOUND IN THE DATABASE");
        }
    }
}
