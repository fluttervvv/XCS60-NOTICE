package com.hook.xcs60notice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.utils.ResponseBuilder;
import com.hook.xcs60notice.dao.NoticeLocaleRepository;
import com.hook.xcs60notice.dto.NoticeLocalRequest;
import com.hook.xcs60notice.dto.TextsearchRequest;
import com.hook.xcs60notice.model.OpsNoticeLocale;
import com.hook.xcs60notice.model.OpsNoticeSuspect;

@RestController
public class NoticeLocaleController {
	
	@Autowired
	NoticeLocaleRepository noticeLocaleRepository;
	
	@RequestMapping("/NoticeLocalegetByKeyword")
	public Object NoticeLocalegetByKeyword(@RequestBody TextsearchRequest textsearchRequest) {
		try {
			List<OpsNoticeLocale> noticeSuspects = noticeLocaleRepository
					.noticeLocalegetByKeyword(textsearchRequest.getTextsearch());
			return ResponseBuilder.Success(noticeSuspects);

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	@RequestMapping("/NoticeLocalupdDelete")
	public Object NoticeStaffupdDelete(@RequestBody NoticeLocalRequest noticeLocalRequest) {
		try {
			Optional<OpsNoticeLocale> oData = noticeLocaleRepository.findById(noticeLocalRequest.getLocaleID());
			if (oData.isPresent()) {
				OpsNoticeLocale sData = oData.get();
				sData.setIsActive((short) 0);
				return ResponseBuilder.Success("Delete Success");
			}
			return ResponseBuilder.Error("NotFound NoticeLocal ID :" + noticeLocalRequest.getLocaleID());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

}
