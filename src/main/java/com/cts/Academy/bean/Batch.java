package com.cts.Academy.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Batch {
	@Id
	@Column
	String Batch_Id;
	@Column
	String Faculty_Id;
	@Column
	String Start_Date;
	@Column
	String Close_Date;
	@Column
	String End_Date;
	
	public Batch() {
		super();// TODO Auto-generated constructor stub
	}
	
	
	public Batch(String batch_Id, String faculty_Id, String start_Date, String close_Date, String end_Date) {
		super();
		Batch_Id = batch_Id;
		Faculty_Id = faculty_Id;
		Start_Date = start_Date;
		Close_Date = close_Date;
		End_Date = end_Date;
	}


	@Override
	public String toString() {
		return "Batch [Batch_Id=" + Batch_Id + ", Faculty_Id=" + Faculty_Id + ", Start_Date=" + Start_Date
				+ ", Close_Date=" + Close_Date + ", End_Date=" + End_Date + "]";
	}
	public String getBatch_Id() {
		return Batch_Id;
	}
	public void setBatch_Id(String batch_Id) {
		Batch_Id = batch_Id;
	}
	public String getFaculty_Id() {
		return Faculty_Id;
	}
	public void setFaculty_Id(String faculty_Id) {
		Faculty_Id = faculty_Id;
	}
	public String getStart_Date() {
		return Start_Date;
	}
	public void setStart_Date(String start_Date) {
		Start_Date = start_Date;
	}
	public String getClose_Date() {
		return Close_Date;
	}
	public void setClose_Date(String close_Date) {
		Close_Date = close_Date;
	}
	public String getEnd_Date() {
		return End_Date;
	}
	public void setEnd_Date(String end_Date) {
		End_Date = end_Date;
	}
		
}
