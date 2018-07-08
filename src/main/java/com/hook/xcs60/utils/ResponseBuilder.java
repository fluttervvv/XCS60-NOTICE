package com.hook.xcs60.utils;

import com.hook.xcs60.dto.BaseApiErrorResponse;
import com.hook.xcs60.dto.BaseApiResponse;

public  class ResponseBuilder {

	
	public static  BaseApiResponse Success(Object o){
		BaseApiResponse b = new BaseApiResponse();
		b.setResponseData(o);
		b.setIsSuccess(true);
		return b;
	}
	
	public static  BaseApiResponse Success(){
		BaseApiErrorResponse b = new BaseApiErrorResponse();
		b.setMsg("Complete");
		b.setIsSuccess(true);
		BaseApiResponse o = new BaseApiResponse();
		o.setIsSuccess(true);
		o.setResponseData(b);
		return o;
	}
	
	
	public static  BaseApiResponse Error(String msg){
		BaseApiErrorResponse b = new BaseApiErrorResponse();
		b.setMsg(msg);
		b.setIsSuccess(false);
		BaseApiResponse o = new BaseApiResponse();
		o.setIsSuccess(false);
		o.setResponseData(b);
		return o;
	}
	
	
}
