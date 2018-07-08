package com.hook.xcs60notice.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60notice.model.OpsNotice;

public interface NoticeRepository extends CrudRepository<OpsNotice,String> {

	@Query("select t from OpsNotice t "
			+ " join OpsNoticeStaff t1 on t1.noticeCode = t.noticeCode "
			+ " join OpsNoticeSuspect t2 on t2.noticeCode = t.noticeCode "
			+ " where t.isActive = 1 "
			+ "	AND ( "
			+ " t.noticeCode like %:keyword% "
			+ " OR t1.titleName like %:keyword% "
			+ "	OR t1.firstName like %:keyword% "
			+ "	OR t1.firstName like %:keyword% "
			+ " OR t1.departmentName like %:keyword% "
			+ " OR t1.departmentLevel like %:keyword% "
			+ " OR t2.suspectTitleName like %:keyword% "
			+ " OR t2.suspectFirstName like %:keyword% "
			+ " OR t2.suspectLastName like %:keyword% ) ")
	public List<OpsNotice> noticegetByKeyword(@Param("keyword")String keyword);
	
	
	@Query("select t from OpsNotice t "
			+ " join OpsNoticeStaff t1 on t1.noticeCode = t.noticeCode "
			+ " join OpsNoticeSuspect t2 on t2.noticeCode = t.noticeCode "
			+ " where t.isActive = 1 "
			+ "	AND ( "
			+ " t.noticeDate between :dateStartFrom AND :dateStartTo "
			+ " AND t1.titleName like %:staffName% "
			+ "	AND t1.firstName like %:staffName% "
			+ "	AND t1.firstName like %:staffName% "
			+ " AND t1.departmentName like %:departmentName% "
			+ " AND t1.departmentLevel like %:departmentName% "
			+ " AND t2.suspectTitleName like %:suspectName% "
			+ " AND t2.suspectFirstName like %:suspectName% "
			+ " AND t2.suspectLastName like %:suspectName% ) "
			+ " OR t.noticeCode like %:noticeCode% ")
	public List<OpsNotice> noticegetByConAdv(
			@Param("noticeCode")String noticeCode,
			@Param("dateStartFrom")Date dateStartFrom,
			@Param("dateStartTo")Date dateStartTo,
			@Param("staffName")String staffName,
			@Param("departmentName")String departmentName,
			@Param("suspectName")String suspectName
			
			);
}
