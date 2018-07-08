package com.hook.xcs60notice.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class SuspectgetByConAdvRequest {

	BigDecimal suspectType ;
	
	BigDecimal entityType;
	
	@JsonProperty("IDCard")
	String iDCard ;
	
	String passportNo;
	
	String companyTitleCode;
	
	String companyName;
	
	String suspectTitleName;
	
	String suspectFirstName;
	
	String suspectLastName;

	public BigDecimal getSuspectType() {
		return suspectType;
	}

	public void setSuspectType(BigDecimal suspectType) {
		this.suspectType = suspectType;
	}

	public BigDecimal getEntityType() {
		return entityType;
	}

	public void setEntityType(BigDecimal entityType) {
		this.entityType = entityType;
	}

	public String getiDCard() {
		return iDCard;
	}

	public void setiDCard(String iDCard) {
		this.iDCard = iDCard;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getCompanyTitleCode() {
		return companyTitleCode;
	}

	public void setCompanyTitleCode(String companyTitleCode) {
		this.companyTitleCode = companyTitleCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSuspectTitleName() {
		return suspectTitleName;
	}

	public void setSuspectTitleName(String suspectTitleName) {
		this.suspectTitleName = suspectTitleName;
	}

	public String getSuspectFirstName() {
		return suspectFirstName;
	}

	public void setSuspectFirstName(String suspectFirstName) {
		this.suspectFirstName = suspectFirstName;
	}

	public String getSuspectLastName() {
		return suspectLastName;
	}

	public void setSuspectLastName(String suspectLastName) {
		this.suspectLastName = suspectLastName;
	}
	
	
}
