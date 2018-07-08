package com.hook.xcs60notice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DutyunitRequest {

	@JsonProperty("DutyUnitCode")
	String dutyUnitCode ;

	public String getDutyUnitCode() {
		return dutyUnitCode;
	}

	public void setDutyUnitCode(String dutyUnitCode) {
		this.dutyUnitCode = dutyUnitCode;
	}
}
