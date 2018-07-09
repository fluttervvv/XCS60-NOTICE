package com.hook.xcs60notice.controllers;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.utils.ResponseBuilder;
import com.hook.xcs60notice.dao.DocumentRepository;
import com.hook.xcs60notice.dto.DocumentRequest;
import com.hook.xcs60notice.model.OpsDocument;

@RestController
public class DocumentController {

	@Autowired
	DocumentRepository documentRepository;
	
	
	@RequestMapping("/DocumentupdDelete")
	public Object DocumentupdDelete(@RequestBody DocumentRequest documentRequest) {
		try {
			Optional<OpsDocument> oData = documentRepository.findById(documentRequest.getDocumentID());
			if (oData.isPresent()) {
				OpsDocument sData = oData.get();
				sData.setIsActive(BigInteger.valueOf(0));
				return ResponseBuilder.Success();
			}
			return ResponseBuilder.Error("NotFound Notice :" + documentRequest.getDocumentID());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
}
