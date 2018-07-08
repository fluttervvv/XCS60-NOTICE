package com.hook.xcs60notice.dao;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;

import com.hook.xcs60notice.model.OpsNoticeStaff;

public interface NoticetStaffRepository extends CrudRepository<OpsNoticeStaff, BigDecimal> {

}
