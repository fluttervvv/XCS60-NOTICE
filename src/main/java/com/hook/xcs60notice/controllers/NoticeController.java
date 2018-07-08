package com.hook.xcs60notice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hook.xcs60.utils.DateUtil;
import com.hook.xcs60.utils.ResponseBuilder;
import com.hook.xcs60notice.dao.NoticeRepository;
import com.hook.xcs60notice.model.OpsNotice;
import com.hook.xcs60notice.dto.*;

@RestController
public class NoticeController {

	@Autowired
	NoticeRepository noticeRepository;

	@RequestMapping("/NoticegetByKeyword")
	public Object NoticeinsAll(@RequestBody TextsearchRequest textsearchRequest) {
		try {

			List<OpsNotice> opsNotices = noticeRepository.noticegetByKeyword(textsearchRequest.getTextsearch());

			return ResponseBuilder.Success(opsNotices);
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/NoticegetByConAdv")
	public Object NoticegetByConAdv(@RequestBody NoticegetByConAdvRequest r) {
		try {

			List<OpsNotice> opsNotices = noticeRepository.noticegetByConAdv(
				r.getNoticeCode(), r.getDateStartFrom(), r.getDateStartTo(), 
				r.getStaffName(), r.getDepartmentName(), r.getSuspectName());

			return ResponseBuilder.Success(opsNotices);
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	@RequestMapping("/NoticegetByCon")
	public Object NoticegetByCon(@RequestBody NoticeRequest noticeRequest) {
		try {
			Optional<OpsNotice> oData = noticeRepository.findById(noticeRequest.getNoticeCode());
			if (oData.isPresent()) {
				OpsNotice sData = oData.get();
				return ResponseBuilder.Success(sData);
			}
			return ResponseBuilder.Error("NotFound Notice :" + noticeRequest.getNoticeCode());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	@RequestMapping("/NoticeinsAll")
	public Object NoticeinsAll(@RequestBody OpsNotice notice) {
		try {
			if (!noticeRepository.existsById(notice.getNoticeCode())) {
				notice.setIsActive((short) 1);
				noticeRepository.save(notice);
				return ResponseBuilder.Success();
			}
			return ResponseBuilder.Error("duplicate noticeCode :" + notice.getNoticeCode());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	@RequestMapping("/NoticeupdByCon")
	public Object NoticeupdByCon(@RequestBody OpsNotice notice) {
		try {
			if (noticeRepository.existsById(notice.getNoticeCode())) {
				noticeRepository.save(notice);
				return ResponseBuilder.Success();
			}
			return ResponseBuilder.Error("NotFound noticeCode :" + notice.getNoticeCode());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	@RequestMapping("/NoticeupdDelete")
	public Object NoticeupdDelete(@RequestBody NoticeRequest noticeRequest) {
		try {
			Optional<OpsNotice> oData = noticeRepository.findById(noticeRequest.getNoticeCode());
			if (oData.isPresent()) {
				OpsNotice sData = oData.get();
				sData.setIsActive((short) 0);
				return ResponseBuilder.Success("Delete Success");
			}
			return ResponseBuilder.Error("NotFound Notice :" + noticeRequest.getNoticeCode());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	
	

}
