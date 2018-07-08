package com.hook.xcs60notice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.utils.ResponseBuilder;
import com.hook.xcs60notice.dao.SuspectRepository;
import com.hook.xcs60notice.dto.SuspectgetByConAdvRequest;
import com.hook.xcs60notice.model.MasSuspect;

@RestController
public class SuspectController {

	@Autowired
	SuspectRepository suspectRepository;

	@RequestMapping("/SuspectgetByConAdv")
	public Object SuspectgetByConAdv(SuspectgetByConAdvRequest advRequest) {
		try {

			List<MasSuspect> masSuspects = suspectRepository.suspectgetByConAdv(advRequest.getSuspectType(),
					advRequest.getEntityType(), advRequest.getiDCard(), advRequest.getPassportNo(),
					advRequest.getCompanyTitleCode(), advRequest.getCompanyName(), advRequest.getSuspectTitleName(),
					advRequest.getSuspectFirstName(), advRequest.getSuspectLastName());

			return ResponseBuilder.Success(masSuspects);
		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

}
