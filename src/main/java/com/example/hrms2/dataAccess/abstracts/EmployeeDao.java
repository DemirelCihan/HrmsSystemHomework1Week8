package com.example.hrms2.dataAccess.abstracts;

import com.example.hrms2.entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {

    Employee getByEmployeeFirstName(String employeeFirstName);


}
