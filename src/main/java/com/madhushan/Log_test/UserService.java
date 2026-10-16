package com.madhushan.Log_test;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

    public String getUserById(Long id) {
        log.debug("Looking up user with ID: {}", id);

        // Example only: replace this with repository access.
        if (id <= 0) {
            log.warn("Invalid user ID received");
            throw new IllegalArgumentException(
                    "User ID must be positive");
        }

        log.info("User lookup completed for ID: {}", id);

        return "User " + id;

    }

}
