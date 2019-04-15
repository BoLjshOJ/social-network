package com.boljshoj.socialnetwork.repo;

import com.boljshoj.socialnetwork.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}