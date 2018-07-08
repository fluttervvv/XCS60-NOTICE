package com.hook.xcs60notice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextsearchRequest {

	
	public String getTextsearch() {
		return textsearch;
	}

	public void setTextsearch(String textsearch) {
		this.textsearch = textsearch;
	}

	@JsonProperty("Textsearch")
	String textsearch ;
	
}
