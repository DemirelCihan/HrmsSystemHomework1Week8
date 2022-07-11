package com.example.hrms2.business.abstracts;

import com.example.hrms2.core.results.DataResult;
import com.example.hrms2.core.results.Result;
import com.example.hrms2.entities.concretes.Employer;
import com.example.hrms2.entities.concretes.Job;

import java.util.List;

public interface JobService {

    DataResult<List<Job>> getAll();

    Result add(Job job);

}
