package com.zensar.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.employee.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Long> {
    Employee findByUserId(Long userId);
}