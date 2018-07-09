package com.hook.xcs60notice.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60notice.model.MasSuspect;

public interface SuspectRepository extends CrudRepository<MasSuspect, Short> {

	@Query("select t from MasSuspect t "
			+ " where t.isActive = 1 and ( "
			+ "  t.suspectType = :suspectType "
			+ " and t.entityType = :entityType "
			+ " and ( t.iDCard like %:iDCard% or t.iDCard  is null ) "
			+ " and ( t.passportNo like %:passportNo% or t.passportNo is null ) "
			+ " and ( t.companyTitleCode like %:companyTitleCode% or t.companyTitleCode is null ) "
			+ " and ( t.companyName like %:companyName% or t.companyName is null ) "
			+ " and ( t.suspectTitleName like %:suspectTitleName% or t.suspectTitleName is null ) "
			+ " and ( t.suspectFirstName like %:suspectFirstName% or t.suspectFirstName is null ) "
			+ " and ( t.suspectLastName like %:suspectLastName% or t.suspectLastName is null ) )")
	public List<MasSuspect> suspectgetByConAdv(
			@Param("suspectType")Short suspectType ,
			@Param("entityType")Short entityType,
			@Param("iDCard")String iDCard,
			@Param("passportNo")String passportNo,
			@Param("companyTitleCode")String companyTitleCode,
			@Param("companyName")String companyName,
			@Param("suspectTitleName")String suspectTitleName,
			@Param("suspectFirstName")String suspectFirstName,
			@Param("suspectLastName")String suspectLastName
			
			);
}
