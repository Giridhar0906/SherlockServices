package com.giridhar.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.giridhar.main.model.User;

public interface UserRepository extends JpaRepository<User, Long>{}