package com.hook.xcs60notice.dto;

import java.util.Date;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class NoticegetByConAdvRequest {

	public String getNoticeCode() {
		return noticeCode;
	}

	public void setNoticeCode(String noticeCode) {
		this.noticeCode = noticeCode;
	}

	public Date getDateStartFrom() {
		return dateStartFrom;
	}

	public void setDateStartFrom(Date dateStartFrom) {
		this.dateStartFrom = dateStartFrom;
	}

	public Date getDateStartTo() {
		return dateStartTo;
	}

	public void setDateStartTo(Date dateStartTo) {
		this.dateStartTo = dateStartTo;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getSuspectName() {
		return suspectName;
	}

	public void setSuspectName(String suspectName) {
		this.suspectName = suspectName;
	}

	
	String noticeCode ;
	
	Date dateStartFrom ;
	
	Date dateStartTo;
	
	String staffName ;
	
	String departmentName ;
	
	String suspectName;
	
	
}
