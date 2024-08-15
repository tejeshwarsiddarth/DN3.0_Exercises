package com.employee.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
}