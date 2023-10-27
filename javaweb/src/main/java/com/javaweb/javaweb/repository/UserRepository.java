package com.javaweb.javaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javaweb.javaweb.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
