package edu.vwcc.careertrack.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class JobApplication {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank
	    private String companyName;

	    @NotBlank
	    private String jobTitle;

	    private String location;
	    private String status;
	    private LocalDate dateApplied;
	    private LocalDate followUpDate;
	    private String salaryRange;
	    private String jobUrl;

	    private String notes;

	    public Long getId() {
	        return id;
	    }
	    
	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getCompanyName() {
	        return companyName;
	    }

	    public void setCompanyName(String companyName) {
	        this.companyName = companyName;
	    }

	    public String getJobTitle() {
	        return jobTitle;
	    }

	    public void setJobTitle(String jobTitle) {
	        this.jobTitle = jobTitle;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    public LocalDate getDateApplied() {
	        return dateApplied;
	    }

	    public void setDateApplied(LocalDate dateApplied) {
	        this.dateApplied = dateApplied;
	    }

	    public LocalDate getFollowUpDate() {
	        return followUpDate;
	    }

	    public void setFollowUpDate(LocalDate followUpDate) {
	        this.followUpDate = followUpDate;
	    }

	    public String getSalaryRange() {
	        return salaryRange;
	    }

	    public void setSalaryRange(String salaryRange) {
	        this.salaryRange = salaryRange;
	    }

	    public String getJobUrl() {
	        return jobUrl;
	    }

	    public void setJobUrl(String jobUrl) {
	        this.jobUrl = jobUrl;
	    }

	    public String getNotes() {
	        return notes;
	    }

	    public void setNotes(String notes) {
	        this.notes = notes;
	    }

}
