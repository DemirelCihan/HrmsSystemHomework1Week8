package com.example.hrms2.api.controllers;

import com.example.hrms2.business.abstracts.EmployeeService;
import com.example.hrms2.business.concretes.EmployeeManager;
import com.example.hrms2.core.results.DataResult;
import com.example.hrms2.core.results.Result;
import com.example.hrms2.dataAccess.abstracts.EmployeeDao;
import com.example.hrms2.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    //add Dao
    private EmployeeService employeeService;

    @Autowired
    //call manager class
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/getall")
    public DataResult<List<Employee>> getAll(){
        return this.employeeService.getAll();//kendi getall metodumuzu yazmıs olduk.

    }
    @GetMapping("/getAllDesc")
    public  DataResult<List<Employee>> getAllSorted(){
        return this.employeeService.getAllSorted();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employee employee){
        return this.employeeService.add(employee);
    }

    @GetMapping("/getByEmpoleeFirstName")
public DataResult<Employee> getByEmployeeFirstName(@RequestParam String employeeFirstName){
        return this.employeeService.getByEmployeeFirstName(employeeFirstName);
    }

}
