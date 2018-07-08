package com.hook.xcs60notice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60notice.model.OpsNoticeProduct;

public interface NoticeProductRepository extends CrudRepository<OpsNoticeProduct, Long> {

	@Query("select t from OpsNoticeProduct t "
			+ " where t.isActive = 1 "
			+ " and ( "
			+ " t.productDesc like %:keyword% )")
	public List<OpsNoticeProduct> noticeProductgetByKeyword(@Param("keyword")String keyword);
}
