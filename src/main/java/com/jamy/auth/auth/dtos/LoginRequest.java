package com.jamy.auth.auth.dtos;

public record LoginRequest(
        String email,
        String password
) {
}
