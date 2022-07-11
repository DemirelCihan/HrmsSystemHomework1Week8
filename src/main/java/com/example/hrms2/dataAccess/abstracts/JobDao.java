package com.example.hrms2.dataAccess.abstracts;

import com.example.hrms2.entities.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<Job,Integer> {

}
