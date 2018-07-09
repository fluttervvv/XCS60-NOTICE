package com.hook.xcs60notice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.utils.ResponseBuilder;
import com.hook.xcs60notice.dao.NoticetInformerRepository;
import com.hook.xcs60notice.dto.NoticetInformerRequest;
import com.hook.xcs60notice.model.OpsNoticeInformer;

@RestController
public class NoticetInformerController {

	@Autowired
	NoticetInformerRepository  noticetInformerRepository;
	
	@RequestMapping("/NoticeInformerupdDelete")
	public Object NoticeInformerupdDelete(@RequestBody NoticetInformerRequest informerRequest) {
		try {
			Optional<OpsNoticeInformer> oData = noticetInformerRepository.findById(informerRequest.getInformerID());
			if (oData.isPresent()) {
				OpsNoticeInformer sData = oData.get();
				sData.setIsActive((short) 0);
				return ResponseBuilder.Success();
			}
			return ResponseBuilder.Error("NotFound Notice Staff :" + informerRequest.getInformerID());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	
	
	
}
