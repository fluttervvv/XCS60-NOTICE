package com.hook.xcs60notice.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class NoticetStaffRequest {

	BigDecimal staffID ;

	public BigDecimal getStaffID() {
		return staffID;
	}

	public void setStaffID(BigDecimal staffID) {
		this.staffID = staffID;
	}
}
