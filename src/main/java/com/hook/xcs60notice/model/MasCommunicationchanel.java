package com.hook.xcs60notice.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Entity
@Table(name = "\"mas_communicationchanel\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class MasCommunicationchanel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "\"CommunicationChanelID\"")
	private BigDecimal communicationChanelID;

	@Column(name ="\"CommunicationChanelName\"")
	private String communicationChanelName;
	
	@Column(name = "\"IsActive\"")
	private Short isActive;
	
	public BigDecimal getCommunicationChanelID() {
		return communicationChanelID;
	}

	public void setCommunicationChanelID(BigDecimal communicationChanelID) {
		this.communicationChanelID = communicationChanelID;
	}

	public String getCommunicationChanelName() {
		return communicationChanelName;
	}

	public void setCommunicationChanelName(String communicationChanelName) {
		this.communicationChanelName = communicationChanelName;
	}

	public Short getIsActive() {
		return isActive;
	}

	public void setIsActive(Short isActive) {
		this.isActive = isActive;
	}


}
