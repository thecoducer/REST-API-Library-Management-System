package io.github.thecoducer.restapilms.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Students {
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name = "student")
	private Users user;
	
	@Column(name = "roll_no", unique = true)
	private long rollNo;
	
	@Column(name = "card_id")
	private String cardId;
	
	@Column(name = "dob")
	private String dateOfBirth;
	
	@Column(name = "yoa")
	private String yearOfAdmission;
	
	private String year;
	private String dept;
	private String course;
	private String phone;
	private String address;
	
	@Column(name = "total_fine")
	private double totalFine;

	private String remarks;
	
	@Column(name = "total_items")
	private String totalItems;

	
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public long getRollNo() {
		return rollNo;
	}

	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getYearOfAdmission() {
		return yearOfAdmission;
	}

	public void setYearOfAdmission(String yearOfAdmission) {
		this.yearOfAdmission = yearOfAdmission;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getTotalFine() {
		return totalFine;
	}

	public void setTotalFine(double totalFine) {
		this.totalFine = totalFine;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(String totalItems) {
		this.totalItems = totalItems;
	}

	@Override
	public String toString() {
		return "Students [user=" + user + ", rollNo=" + rollNo + ", cardId=" + cardId + ", dateOfBirth=" + dateOfBirth
				+ ", yearOfAdmission=" + yearOfAdmission + ", year=" + year + ", dept=" + dept + ", course=" + course
				+ ", phone=" + phone + ", address=" + address + ", totalFine=" + totalFine + ", remarks=" + remarks
				+ ", totalItems=" + totalItems + "]";
	}
	
}
