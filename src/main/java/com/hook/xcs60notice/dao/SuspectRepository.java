package com.hook.xcs60notice.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60notice.model.MasSuspect;

public interface SuspectRepository extends CrudRepository<MasSuspect, Short> {

	@Query("select t from MasSuspect t "
			+ " where t.isActive = 1 "
			+ " and t.suspectType = :suspectType "
			+ " and t.entityType = :entityType "
			+ " and t.iDCard like %:iDCard% "
			+ " and t.passportNo like %:passportNo% "
			+ " and t.companyTitleCode like %:companyTitleCode% "
			+ " and t.companyName like %:companyName% "
			+ " and t.suspectTitleName like %:suspectTitleName% "
			+ " and t.suspectFirstName like %:suspectFirstName% "
			+ " and t.suspectLastName like %:suspectLastName% ")
	public List<MasSuspect> suspectgetByConAdv(
			@Param("suspectType")BigDecimal suspectType ,
			@Param("entityType")BigDecimal entityType,
			@Param("iDCard")String iDCard,
			@Param("passportNo")String passportNo,
			@Param("companyTitleCode")String companyTitleCode,
			@Param("companyName")String companyName,
			@Param("suspectTitleName")String suspectTitleName,
			@Param("suspectFirstName")String suspectFirstName,
			@Param("suspectLastName")String suspectLastName
			
			);
}
