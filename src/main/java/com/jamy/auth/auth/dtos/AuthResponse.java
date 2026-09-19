package com.jamy.auth.auth.dtos;

public record AuthResponse(
        String username,
        String token
) {
}
