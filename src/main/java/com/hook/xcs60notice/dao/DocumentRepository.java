package com.hook.xcs60notice.dao;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;

import com.hook.xcs60notice.model.OpsDocument;

public interface DocumentRepository extends CrudRepository<OpsDocument, BigDecimal> {

}
