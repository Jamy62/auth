package com.jamy.auth.user;

public interface UserService {
    User getUserByUsername(String username);
    User getUserByEmail(String email);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    void save(User user);
}
