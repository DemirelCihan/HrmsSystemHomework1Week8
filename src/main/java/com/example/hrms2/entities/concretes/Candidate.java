package com.example.hrms2.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidates")
@EqualsAndHashCode(callSuper = false)

public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_id")
    private int candidateId;

    @Column(name = "first_name")
    private String candidateFirstName;

    @Column(name = "last_name")
    private String candidateLastName;

    @Column(name = "national_identity")
    private int nationalIdentity;

    @Column(name = "birth_year")
    private int birthYear;

}
