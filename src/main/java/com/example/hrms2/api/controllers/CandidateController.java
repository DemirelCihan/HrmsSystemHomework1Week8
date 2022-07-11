package com.example.hrms2.api.controllers;

import com.example.hrms2.business.abstracts.CandidateService;
import com.example.hrms2.core.results.DataResult;
import com.example.hrms2.core.results.Result;
import com.example.hrms2.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {
    private CandidateService candidateService;
    @Autowired
    public CandidateController(CandidateService candidateService){
        this.candidateService = candidateService;
    }

    @GetMapping("/getall")
    public DataResult<List<Candidate>>getAll(){
        return this.candidateService.getAll();
    }

    @GetMapping("/getAllDesc")
    public DataResult<List<Candidate>> getAllSorted(){
        return this.candidateService.getAllSorted();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Candidate candidate){
        return this.candidateService.add(candidate);
    }

    @GetMapping("/getByCandidateName")
    public DataResult<List<Candidate>> getByCandidateFirstName(@RequestParam String candidateFirstName){
    return this.candidateService.getByCandidateFirstName(candidateFirstName);
    }


}
