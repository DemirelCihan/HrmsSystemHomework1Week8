package com.example.hrms2.business.abstracts;

import com.example.hrms2.core.results.DataResult;
import com.example.hrms2.core.results.Result;
import com.example.hrms2.entities.concretes.Employer;

import java.util.List;


public interface EmployerService {

    DataResult<Employer> getByCompanyName(String companyName);

    DataResult<List<Employer>>getAll();
    Result add(Employer employer);

}
