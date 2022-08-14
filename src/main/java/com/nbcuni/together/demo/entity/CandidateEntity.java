package com.nbcuni.together.demo.entity;

import javax.persistence.*;

@Entity
public class CandidateEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String candidateName;
    private String candidateDepartment;
    private String computerLanguage;
    private boolean optimistic;
    private String skills;

    public CandidateEntity() {
    }

    public CandidateEntity(Long id, String candidateName, String candidateDepartment, String computerLanguage, boolean optimistic, String skills) {
        this.id = id;
        this.candidateName = candidateName;
        this.candidateDepartment = candidateDepartment;
        this.computerLanguage = computerLanguage;
        this.optimistic = optimistic;
        this.skills = skills;
    }

    public String getComputerLanguage() {
        return computerLanguage;
    }

    public void setComputerLanguage(String computerLanguage) {
        this.computerLanguage = computerLanguage;
    }

    public boolean isOptimistic() {
        return optimistic;
    }

    public void setOptimistic(boolean optimistic) {
        this.optimistic = optimistic;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateDepartment() {
        return candidateDepartment;
    }

    public void setCandidateDepartment(String candidateDepartment) {
        this.candidateDepartment = candidateDepartment;
    }
}
