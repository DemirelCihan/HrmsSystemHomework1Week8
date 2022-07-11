package com.example.hrms2.business.abstracts;

import com.example.hrms2.core.results.DataResult;
import com.example.hrms2.core.results.Result;
import com.example.hrms2.entities.concretes.Employee;
import javassist.CodeConverter;

import java.util.List;

public interface EmployeeService {
    DataResult<List<Employee>> getAll();

    DataResult<List<Employee>> getAllSorted();

    Result add(Employee employee);

    DataResult<Employee> getByEmployeeFirstName(String employeeFirstName);





}
