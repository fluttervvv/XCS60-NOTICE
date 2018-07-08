package com.hook.xcs60notice.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class NoticeLocalRequest {

	public Long getLocaleID() {
		return localeID;
	}

	public void setLocaleID(Long localeID) {
		this.localeID = localeID;
	}
	
	public void setLocaleID(String localeID) {
		this.localeID = Long.valueOf(localeID);
	}

	Long localeID ; 
	
}
