package com.example.hrms2.business.concretes;

import com.example.hrms2.business.abstracts.CandidateService;
import com.example.hrms2.core.results.DataResult;
import com.example.hrms2.core.results.Result;
import com.example.hrms2.core.results.SuccessDataResult;
import com.example.hrms2.core.results.SuccessResult;
import com.example.hrms2.dataAccess.abstracts.CandidateDao;
import com.example.hrms2.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;
    @Autowired
    public CandidateManager(CandidateDao candidateDao){
        this.candidateDao = candidateDao;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>
                (this.candidateDao.findAll(),"Aday verileri listelendi.");/*this.candidateDao.findAll() bizim datamız olmus
                oluyor.*/
    }

    @Override
    public DataResult<List<Candidate>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.DESC,"candidateFirstName");//DESC ile büyükten küçüğe sırlama yapmaktadır.
        return new SuccessDataResult<List<Candidate>>
                (this.candidateDao.findAll(sort),"sıralama işlemi başarılı");
    }

    @Override
    public Result add(Candidate candidate) {
        this.candidateDao.save(candidate);
        return new SuccessResult("aday eklendi");
    }

    @Override
    public DataResult<List<Candidate>> getByCandidateFirstName(String candidateFirstName) {
        return new SuccessDataResult<Candidate>
                (this.candidateDao.getByCandidateFirstName(candidateFirstName));
    }
}
