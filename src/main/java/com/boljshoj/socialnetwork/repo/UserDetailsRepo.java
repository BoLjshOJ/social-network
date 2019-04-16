package com.boljshoj.socialnetwork.repo;

import com.boljshoj.socialnetwork.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}