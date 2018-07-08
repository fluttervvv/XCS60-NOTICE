package com.hook.xcs60.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseApiResponse extends ApiResponse {


	String errorCode ;
	Object responseData;
	


	@JsonProperty("ErrorCode")
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	@JsonProperty("ResponseData")
	public Object getResponseData() {
		return responseData;
	}
	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}
	
	
	
}
