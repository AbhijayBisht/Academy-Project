package com.cts.Academy.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Faculty")
@Table
public class Faculty {
	@Id
	@Column
	String Faculty_Id;
	@Column
	String Faculty_Name;
	@Column
	String Qualification;
	
	public Faculty() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Faculty [Faculty_Id=" + Faculty_Id + ", Faculty_Name=" + Faculty_Name + ", Qualification="
				+ Qualification + "]";
	}
	public String getFaculty_Id() {
		return Faculty_Id;
	}
	public void setFaculty_Id(String faculty_Id) {
		Faculty_Id = faculty_Id;
	}
	public String getFaculty_Name() {
		return Faculty_Name;
	}
	public void setFaculty_Name(String faculty_Name) {
		Faculty_Name = faculty_Name;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	
}
