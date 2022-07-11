package com.example.hrms2.business.abstracts;

import com.example.hrms2.core.results.DataResult;
import com.example.hrms2.core.results.Result;
import com.example.hrms2.entities.concretes.Candidate;


import java.util.List;

public interface CandidateService {

    DataResult<List<Candidate>> getAll(); //aday listesini listelemiş olacak.

    DataResult<List<Candidate>> getAllSorted(); //datayı (adaylar listesini istenilen şartlara göre listelem yapacak.// )

    Result add(Candidate candidate); /*Herhangi bir adayı ekleme için kullanılcak.*/

    DataResult<List<Candidate>> getByCandidateFirstName(String candidateFirstName);


}
