package com.dotnetenemies.library.repositories;

import com.dotnetenemies.library.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
