package com.hook.xcs60notice.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class NoticeProductRequest {

	Long productID ;

	public Long getProductID() {
		return productID;
	}

	public void setProductID(Long productID) {
		this.productID = productID;
	}
	
	public void setProductID(String productID) {
		this.productID = Long.valueOf(productID);
	}
	
	
	
}
