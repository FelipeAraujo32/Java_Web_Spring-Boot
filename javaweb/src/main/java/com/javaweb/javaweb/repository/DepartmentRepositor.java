package com.javaweb.javaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javaweb.javaweb.entities.Department;

public interface DepartmentRepositor extends JpaRepository <Department, Long> {
    
}
