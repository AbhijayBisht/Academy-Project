package com.cts.Academy.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="SkillMaster")
@Table
public class SkillMaster {
	@Id
	@Column
	String Skill_Id;
	@Column
	String Skill;
	@Column
	String Certification;
	
	
	public SkillMaster() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SkillMaster [Skill_Id=" + Skill_Id + ", Skill=" + Skill + ", Certification=" + Certification + "]";
	}
	public String getSkill_Id() {
		return Skill_Id;
	}
	public void setSkill_Id(String skill_Id) {
		Skill_Id = skill_Id;
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
