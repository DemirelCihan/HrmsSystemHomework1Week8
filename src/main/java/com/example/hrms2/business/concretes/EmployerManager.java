package com.example.hrms2.business.concretes;

import com.example.hrms2.business.abstracts.EmployerService;
import com.example.hrms2.core.results.DataResult;
import com.example.hrms2.core.results.Result;
import com.example.hrms2.core.results.SuccessDataResult;
import com.example.hrms2.core.results.SuccessResult;
import com.example.hrms2.dataAccess.abstracts.EmployeeDao;
import com.example.hrms2.dataAccess.abstracts.EmployerDao;
import com.example.hrms2.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;
    @Autowired
    public EmployerManager(EmployerDao employerDao){
        this.employerDao = employerDao;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>
                (this.employerDao.findAll(),"Veriler Listelendi");
    }

    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("yeni şirket ekleme işlemi tamamlandı");
    }


    @Override
    public DataResult<Employer> getByCompanyName(String companyName){
        return new SuccessDataResult<Employer>
                (this.employerDao.getByCompanyName(companyName),"Şirket isimleri listelendi");
    }


}
