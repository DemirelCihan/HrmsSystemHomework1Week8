package com.example.hrms2.api.controllers;

import com.example.hrms2.business.abstracts.EmployerService;
import com.example.hrms2.core.results.DataResult;
import com.example.hrms2.core.results.Result;
import com.example.hrms2.core.results.SuccessDataResult;
import com.example.hrms2.entities.concretes.Employer;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
    private EmployerService employerService;
    @Autowired
    public EmployerController(EmployerService employerService){
        this.employerService = employerService;
    }

    @GetMapping("/getall")
    public DataResult<List<Employer>>getAll(){
        return this.employerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employer employer){
        return this.employerService.add(employer);
    }


    @GetMapping("/getByCompanyName")
    public DataResult<Employer> getByCompanyName(@RequestParam String companyName){
        return this.employerService.getByCompanyName(companyName);
    }


}
