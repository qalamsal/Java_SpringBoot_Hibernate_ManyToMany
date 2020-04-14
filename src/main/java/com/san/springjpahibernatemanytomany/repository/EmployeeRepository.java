package com.san.springjpahibernatemanytomany.repository;

import com.san.springjpahibernatemanytomany.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
