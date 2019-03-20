package com.cts.Academy.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="SkillSet")
@Table
public class SkillSet {
	@Id
	@Column
	String Faculty_Id;
	@Column
	String Skill;
	@Column
	String Certification;
	
	
	public SkillSet() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SkillSet [Faculty_Id=" + Faculty_Id + ", Skill=" + Skill + ", Certification=" + Certification + "]";
	}
	public String getFaculty_Id() {
		return Faculty_Id;
	}
	public void setFaculty_Id(String faculty_Id) {
		Faculty_Id = faculty_Id;
	}
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
	public String getCertification() {
		return Certification;
	}
	public void setCertification(String certification) {
		Certification = certification;
	}
}