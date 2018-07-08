package com.hook.xcs60.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse {
	Boolean isSuccess ;
	
	@JsonProperty("IsSuccess")
	public Boolean getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
}
