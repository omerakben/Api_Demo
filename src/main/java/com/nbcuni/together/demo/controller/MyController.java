package com.nbcuni.together.demo.controller;

import com.nbcuni.together.demo.dao.CandidateDao;
import com.nbcuni.together.demo.entity.CandidateEntity;
import com.nbcuni.together.demo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
@ResponseBody

public class MyController {

    @Autowired
    TeamRepository teamRepository;

    @GetMapping("/myAPI")
    public String myAPI() {
        return "Here you can \n This is NBCUniversal World...";
    }

    @PostMapping("/addTeamMember")
    public CandidateEntity addTeamMember(@RequestBody CandidateDao candidateDao) {

        CandidateEntity candidateEntity = new CandidateEntity();
        candidateEntity.setId(candidateDao.getId());
        candidateEntity.setCandidateName(candidateDao.getCandidateName());
        candidateEntity.setCandidateDepartment(candidateDao.getCandidateDepartment());
        candidateEntity.setComputerLanguage(candidateDao.getComputerLanguage());
        candidateEntity.setOptimistic(candidateDao.isOptimistic());
        candidateEntity.setSkills(candidateDao.getSkills());

        return teamRepository.save(candidateEntity);
    }

    @GetMapping("/getAllCandidates")
    public List<CandidateEntity> getAllCandidates() {
        return teamRepository.findAll();
    }

    @PutMapping("/updateCandidate")
    public CandidateEntity updateCandidate(@RequestBody CandidateDao candidateDao) {

        Optional<CandidateEntity> cEntity = teamRepository.findById(candidateDao.getId());
        CandidateEntity candidateEntity = cEntity.get();
        candidateEntity.setCandidateName(candidateDao.getCandidateName());
        candidateEntity.setCandidateDepartment(candidateDao.getCandidateDepartment());
        return teamRepository.save(candidateEntity);
    }

    @DeleteMapping("/deleteCandidate")
    public void deleteCandidate(@RequestBody CandidateDao candidateDao) {
        Optional<CandidateEntity> cEntity = teamRepository.findById(candidateDao.getId());
        CandidateEntity candidateEntity = cEntity.get();
        if (cEntity.isPresent()) {
            teamRepository.delete(candidateEntity);
        }

    }


}