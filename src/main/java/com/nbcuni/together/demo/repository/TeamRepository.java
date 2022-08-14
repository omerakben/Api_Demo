package com.nbcuni.together.demo.repository;

import com.nbcuni.together.demo.entity.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<CandidateEntity,Long> {
}
