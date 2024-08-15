package com.employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employee.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartmentName(String departmentName);

    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Employee findByEmail(@Param("email") String email);

    List<Employee> findAllByOrderByNameAsc();

    List<Employee> findByNameContaining(String keyword);

    List<Employee> findByDepartmentId(Long departmentId);

    @Query("SELECT e FROM Employee e WHERE e.name LIKE %:name%")
    List<Employee> searchByName(@Param("name") String name);

    long countByDepartmentName(String departmentName);

    List<Employee> findByDepartmentNameOrderByNameAsc(String departmentName);

    List<Employee> findTop5ByOrderByIdDesc();

    List<Employee> findByEmailEndingWith(String domain);
}
