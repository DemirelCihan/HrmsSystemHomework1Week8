package com.example.hrms2.business.concretes;

import com.example.hrms2.business.abstracts.JobService;
import com.example.hrms2.core.results.DataResult;
import com.example.hrms2.core.results.Result;
import com.example.hrms2.core.results.SuccessDataResult;
import com.example.hrms2.core.results.SuccessResult;
import com.example.hrms2.dataAccess.abstracts.JobDao;
import com.example.hrms2.entities.concretes.Employer;
import com.example.hrms2.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {

    private JobDao jobDao;
    @Autowired
    public JobManager(JobDao jobDao){
        this.jobDao=jobDao;
    }

    @Override
    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<List<Job>>
                (this.jobDao.findAll(),"Veriler listelendi");
    }



    @Override
    public Result add(Job job) {
        this.jobDao.save(job);
        return new SuccessResult("added");
    }
}
