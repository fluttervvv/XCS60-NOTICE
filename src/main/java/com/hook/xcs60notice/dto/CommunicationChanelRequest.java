package com.hook.xcs60notice.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommunicationChanelRequest {

	@JsonProperty("CommunicationChanelID")
	BigDecimal communicationChanelID;

	public BigDecimal getCommunicationChanelID() {
		return communicationChanelID;
	}

	public void setCommunicationChanelID(BigDecimal communicationChanelID) {
		this.communicationChanelID = communicationChanelID;
	}
	
	
}
