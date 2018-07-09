package com.hook.xcs60notice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60notice.model.OpsNoticeSuspect;

public interface NoticeSuspectRepository extends CrudRepository<OpsNoticeSuspect, Short> {

	
	@Query("select t from OpsNoticeSuspect t "
			+ " where t.isActive = 1 and "
			+ " ( concat(t.suspectReferenceID,'') like %:keyword% "
			+ " or t.noticeCode like %:keyword% "
			+ " or t.suspectTitleName like %:keyword% "
			+ " or t.suspectFirstName like %:keyword% "
			+ " or t.suspectLastName like %:keyword% "
			+ " or t.companyTitleName like %:keyword% "
			+ " or t.companyName like %:keyword% "
			+ " or t.companyOtherName like %:keyword% ) ")
	public List<OpsNoticeSuspect> noticeSuspectgetByKeyword(@Param("keyword")String keyword);
	
}
