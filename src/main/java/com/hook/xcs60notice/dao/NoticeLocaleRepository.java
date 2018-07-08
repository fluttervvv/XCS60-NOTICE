package com.hook.xcs60notice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60notice.model.OpsNoticeLocale;

public interface NoticeLocaleRepository extends CrudRepository<OpsNoticeLocale, Long> {

	
	
	@Query("select t from OpsNoticeLocale t "
			+ " where t.isActive = 1 "
			+ " and ( "
			+ " t.subdistrictCode like %:keyword% "
			+ " or t.subDistrict like %:keyword% "
			+ " or t.district like %:keyword% "
			+ " or t.province like %:keyword% "
			+ " or t.provinceCode like %:keyword% ) ")
	public List<OpsNoticeLocale> noticeLocalegetByKeyword(@Param("keyword")String keyword);
}
