package com.hook.xcs60notice.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class NoticetInformerRequest {

	BigDecimal informerID;

	public BigDecimal getInformerID() {
		return informerID;
	}

	public void setInformerID(BigDecimal informerID) {
		this.informerID = informerID;
	} 
	
}
