package com.cg.freelanceapp.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Job {
	
	
	@Id
	@Column(name="job_id" , updatable = false)
	@SequenceGenerator(name="job_seq", initialValue = 1001)
	private Long id;
	
	private Skill skill;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="recruiter_id")
	private Recruiter postedBy;
	private LocalDate postedDate;
	private Freelancer awardedTo;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="job_application_id")
	private List<JobApplication> jobApplications;
	
	@Column(updatable = false)
	private Boolean active;
	
	
	
	
	public Job() {
		super();
	}
	public Job(Long id, Skill skill, Recruiter postedBy, LocalDate postedDate, Freelancer awardedTo,
			List<JobApplication> jobApplications, Boolean active) {
		super();
		this.id = id;
		this.skill = skill;
		this.postedBy = postedBy;
		this.postedDate = postedDate;
		this.awardedTo = awardedTo;
		this.jobApplications = jobApplications;
		this.active = active;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public Recruiter getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(Recruiter postedBy) {
		this.postedBy = postedBy;
	}
	public LocalDate getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(LocalDate postedDate) {
		this.postedDate = postedDate;
	}
	public Freelancer getAwardedTo() {
		return awardedTo;
	}
	public void setAwardedTo(Freelancer awardedTo) {
		this.awardedTo = awardedTo;
	}
	public List<JobApplication> getJobApplications() {
		return jobApplications;
	}
	public void setJobApplications(List<JobApplication> jobApplications) {
		this.jobApplications = jobApplications;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	
}
