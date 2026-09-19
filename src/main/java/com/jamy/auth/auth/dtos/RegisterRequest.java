package com.jamy.auth.auth.dtos;

public record RegisterRequest(
        String username,
        String email,
        String password
) {
}
