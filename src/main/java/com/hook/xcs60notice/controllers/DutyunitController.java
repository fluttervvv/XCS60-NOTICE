package com.hook.xcs60notice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.utils.ResponseBuilder;
import com.hook.xcs60notice.dao.DutyunitRepository;
import com.hook.xcs60notice.dto.DutyunitRequest;
import com.hook.xcs60notice.model.MasDutyunit;

@RestController
public class DutyunitController {

	@Autowired
	DutyunitRepository dutyunitRepository;
	
	@RequestMapping("/DutyunitgetByCon")
	public Object DutyunitgetByCon(@RequestBody DutyunitRequest dutyunitRequest) {
		try {
			Optional<MasDutyunit> oData = dutyunitRepository.findById(dutyunitRequest.getDutyUnitCode());
			if (oData.isPresent()) {
				MasDutyunit sData = oData.get();
				return ResponseBuilder.Success(sData);
			}
			return ResponseBuilder.Error("NotFound Dutyunit ID :" + dutyunitRequest.getDutyUnitCode());

		} catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
}
