package com.hook.xcs60notice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.utils.ResponseBuilder;
import com.hook.xcs60notice.dao.NoticeProductRepository;
import com.hook.xcs60notice.dto.NoticeProductRequest;
import com.hook.xcs60notice.dto.TextsearchRequest;
import com.hook.xcs60notice.model.OpsNoticeLocale;
import com.hook.xcs60notice.model.OpsNoticeProduct;

@RestController
public class NoticeProductController {

	@Autowired
	NoticeProductRepository noticeProductRepository;
	
	
	@RequestMapping("/NoticeProductgetByKeyword")
	public Object NoticeLocalegetByKeyword(@RequestBody TextsearchRequest textsearchRequest) {
		try {
			List<OpsNoticeProduct> noticeSuspects = noticeProductRepository
					.noticeProductgetByKeyword(textsearchRequest.getTextsearch());
			return ResponseBuilder.Success(noticeSuspects);

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	@RequestMapping("/NoticeProductgetByCon")
	public Object NoticeProductgetByCon(@RequestBody NoticeProductRequest noticeProductRequest) {
		try {
			Optional<OpsNoticeProduct> oData = noticeProductRepository.findById(noticeProductRequest.getProductID());
			if (oData.isPresent()) {
				OpsNoticeProduct sData = oData.get();
				return ResponseBuilder.Success(sData);
			}
			return ResponseBuilder.Error("NotFound Product ID :" + noticeProductRequest.getProductID());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	@RequestMapping("/NoticeProductupdDelete")
	public Object NoticeInformerupdDelete(@RequestBody NoticeProductRequest productRequest) {
		try {
			Optional<OpsNoticeProduct> oData = noticeProductRepository.findById(productRequest.getProductID());
			if (oData.isPresent()) {
				OpsNoticeProduct sData = oData.get();
				sData.setIsActive((short) 0);
				return ResponseBuilder.Success("Delete Success");
			}
			return ResponseBuilder.Error("NotFound Product ID :" + productRequest.getProductID());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	
	
	
	
}
