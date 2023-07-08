package com.greatlearning.employeemgmtsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeemgmtsys.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}