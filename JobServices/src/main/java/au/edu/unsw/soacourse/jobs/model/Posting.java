package au.edu.unsw.soacourse.jobs.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Posting {

	/*
	 * Job Postings: _jobId, company name, salary rate, position type, location,
	 * details/job descriptions, status (created, open, in-review, processed,
	 * sent-invitations, etc.). Have a look at a job site like seek.com.au or
	 * LinkedIn to see the types of information relevant to a job posting.
	 */
	
	private String jobId;
	private String companyName;
	private String salaryRate;
	private String positionType;
	private String location;
	private String descriptions;
	private String created;
	private String open;
	private String inReview;
	private String processed;
	private String sentInvitations;

	public Posting() {

	}

	public Posting(String jobId, String companyName, String salaryRate, String positionType, String location,
			String descriptions, String created, String open, String inReview, String processed,
			String sentInvitations) {
		super();
		this.jobId = jobId;
		this.companyName = companyName;
		this.salaryRate = salaryRate;
		this.positionType = positionType;
		this.location = location;
		this.descriptions = descriptions;
		this.created = created;
		this.open = open;
		this.inReview = inReview;
		this.processed = processed;
		this.sentInvitations = sentInvitations;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSalaryRate() {
		return salaryRate;
	}

	public void setSalaryRate(String salaryRate) {
		this.salaryRate = salaryRate;
	}

	public String getPositionType() {
		return positionType;
	}

	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getInReview() {
		return inReview;
	}

	public void setInReview(String inReview) {
		this.inReview = inReview;
	}

	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	public String getSentInvitations() {
		return sentInvitations;
	}

	public void setSentInvitations(String sentInvitations) {
		this.sentInvitations = sentInvitations;
	}

}
