package com.hook.xcs60notice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.utils.ResponseBuilder;
import com.hook.xcs60notice.dao.NoticetStaffRepository;
import com.hook.xcs60notice.dto.NoticeRequest;
import com.hook.xcs60notice.dto.NoticetStaffRequest;
import com.hook.xcs60notice.model.OpsNotice;
import com.hook.xcs60notice.model.OpsNoticeStaff;

@RestController
public class NoticetStaffController {

	@Autowired
	NoticetStaffRepository noticetStaffRepository ;
	
	
	@RequestMapping("/NoticeStaffupdDelete")
	public Object NoticeStaffupdDelete(@RequestBody NoticetStaffRequest noticetStaffRequest) {
		try {
			Optional<OpsNoticeStaff> oData = noticetStaffRepository.findById(noticetStaffRequest.getStaffID());
			if (oData.isPresent()) {
				OpsNoticeStaff sData = oData.get();
				sData.setIsActive((short) 0);
				return ResponseBuilder.Success("Delete Success");
			}
			return ResponseBuilder.Error("NotFound Notice Staff :" + noticetStaffRequest.getStaffID());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	
	
}
