package com.hook.xcs60notice.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class DocumentRequest {

	BigDecimal documentID;

	public BigDecimal getDocumentID() {
		return documentID;
	}

	public void setDocumentID(BigDecimal documentID) {
		this.documentID = documentID;
	}

	public void setDocumentID(String documentID) {
		this.documentID = new BigDecimal(documentID);
	}

}
