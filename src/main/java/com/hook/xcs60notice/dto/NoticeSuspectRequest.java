package com.hook.xcs60notice.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class NoticeSuspectRequest {

	
	
	public Short getSuspectID() {
		return suspectID;
	}

	public void setSuspectID(Short suspectID) {
		this.suspectID = suspectID;
	}
	
	public void setSuspectID(String suspectID) {
		this.suspectID = Short.valueOf(suspectID);
	}

	Short suspectID ;
	
	
}
