package com.example.hrms2.dataAccess.abstracts;

import com.example.hrms2.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

}
