package com.group.libraryapp.config;

import com.group.libraryapp.repository.user.UserJdbcRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

//@Configuration
public class UserConfiguration {
    // 컨피그
    @Bean
    public UserJdbcRepository userRepository(JdbcTemplate jdbcTemplate){
        return new UserJdbcRepository(jdbcTemplate);
    }
}


