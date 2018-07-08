package com.hook.xcs60.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseApiErrorResponse extends ApiResponse {
	
	String msg ;
	
	@JsonProperty("Msg")
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
