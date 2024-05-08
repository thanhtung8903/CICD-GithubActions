package com.example.security;

import java.time.LocalDateTime;

public record ApiError(
        String path,
        String message,
        int status,
        LocalDateTime timestamp


//        add to ver2
) {
}
