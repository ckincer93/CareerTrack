package edu.vwcc.careertrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.vwcc.careertrack.model.JobApplication;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {

}