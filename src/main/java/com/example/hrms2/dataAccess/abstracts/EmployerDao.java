package com.example.hrms2.dataAccess.abstracts;

import com.example.hrms2.entities.concretes.Candidate;
import com.example.hrms2.entities.concretes.Employee;
import com.example.hrms2.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {

    Employer getByCompanyName(String companyName);


}
