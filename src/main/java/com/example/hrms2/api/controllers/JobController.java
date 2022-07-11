package com.example.hrms2.api.controllers;


import com.example.hrms2.business.abstracts.JobService;
import com.example.hrms2.core.results.DataResult;
import com.example.hrms2.core.results.Result;
import com.example.hrms2.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    private JobService jobService;
    @Autowired
    public JobController(JobService jobService){
        this.jobService = jobService;
    }

    @GetMapping("/getall")//bizden bir veri istenildiği zaman bunu GetMapping ile sağlarız
    public DataResult<List<Job>> getAll() {
        return this.jobService.getAll();
    }

    @PostMapping("/add")/*kullanıcı tarafından bir gönderi gönderilmektedir.*/
    public Result add(@RequestBody Job job){
        return this.jobService.add(job);
    }
}
