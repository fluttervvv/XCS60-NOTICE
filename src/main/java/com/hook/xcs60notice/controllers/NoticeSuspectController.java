package com.hook.xcs60notice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.utils.ResponseBuilder;
import com.hook.xcs60notice.dao.NoticeSuspectRepository;
import com.hook.xcs60notice.dto.NoticeSuspectRequest;
import com.hook.xcs60notice.dto.TextsearchRequest;
import com.hook.xcs60notice.model.OpsNoticeSuspect;

@RestController
public class NoticeSuspectController {

	@Autowired
	NoticeSuspectRepository noticeSuspectRepository;

	@RequestMapping("/NoticeSuspectgetByKeyword")
	public Object NoticeSuspectgetByKeyword(@RequestBody TextsearchRequest textsearchRequest) {
		try {
			List<OpsNoticeSuspect> noticeSuspects = noticeSuspectRepository
					.noticeSuspectgetByKeyword(textsearchRequest.getTextsearch());
			return ResponseBuilder.Success(noticeSuspects);

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/NoticeSuspectgetByCon")
	public Object NoticeSuspectgetByCon(@RequestBody NoticeSuspectRequest noticeProductRequest) {
		try {
			Optional<OpsNoticeSuspect> oData = noticeSuspectRepository.findById(noticeProductRequest.getSuspectID());
			if (oData.isPresent()) {
				OpsNoticeSuspect sData = oData.get();
				return ResponseBuilder.Success(sData);
			}
			return ResponseBuilder.Error("NotFound Product ID :" + noticeProductRequest.getSuspectID());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/NoticeSuspectinsAll")
	public Object NoticeSuspectinsAll(OpsNoticeSuspect noticeSuspect) {
		try {
			if (!noticeSuspectRepository.existsById(noticeSuspect.getSuspectID())) {
				noticeSuspect.setIsActive((short) 1);
				noticeSuspectRepository.save(noticeSuspect);
				return ResponseBuilder.Success();
			}
			return ResponseBuilder.Error("duplicate noticeCode :" + noticeSuspect.getSuspectID());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/NoticeSuspectupdByCon")
	public Object NoticeSuspectupdByCon(OpsNoticeSuspect noticeSuspect) {
		try {
			if (!noticeSuspectRepository.existsById(noticeSuspect.getSuspectID())) {
				noticeSuspectRepository.save(noticeSuspect);
				return ResponseBuilder.Success();
			}
			return ResponseBuilder.Error("duplicate noticeCode :" + noticeSuspect.getSuspectID());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

	@RequestMapping("/NoticeSuspectupdDelete")
	public Object NoticeSuspectupdDelete(@RequestBody NoticeSuspectRequest noticeProductRequest) {
		try {
			Optional<OpsNoticeSuspect> oData = noticeSuspectRepository.findById(noticeProductRequest.getSuspectID());
			if (oData.isPresent()) {
				OpsNoticeSuspect sData = oData.get();
				sData.setIsActive((short) 0);
				noticeSuspectRepository.save(sData);
				return ResponseBuilder.Success();
			}
			return ResponseBuilder.Error("NotFound Product ID :" + noticeProductRequest.getSuspectID());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}

}
