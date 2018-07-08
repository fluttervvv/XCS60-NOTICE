package com.hook.xcs60notice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.utils.ResponseBuilder;
import com.hook.xcs60notice.dao.CommunicationchanelRepository;
import com.hook.xcs60notice.dto.CommunicationChanelRequest;
import com.hook.xcs60notice.dto.NoticeProductRequest;
import com.hook.xcs60notice.model.MasCommunicationchanel;
import com.hook.xcs60notice.model.OpsNoticeProduct;

@RestController
public class CommunicationchanelController {

	@Autowired
	CommunicationchanelRepository communicationchanelRepository;
	
	
	@RequestMapping("/CommunicationChanelgetByCon")
	public Object CommunicationChanelgetByCon(@RequestBody CommunicationChanelRequest communicationChanelRequest) {
		try {
			Optional<MasCommunicationchanel> oData = communicationchanelRepository.findById(communicationChanelRequest.getCommunicationChanelID());
			if (oData.isPresent()) {
				MasCommunicationchanel sData = oData.get();
				return ResponseBuilder.Success(sData);
			}
			return ResponseBuilder.Error("NotFound CommunicationChanel ID :" + communicationChanelRequest.getCommunicationChanelID());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
}
