/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60notice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"ops_document\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "OpsDocument.findAll", query = "SELECT o FROM OpsDocument o")
    , @NamedQuery(name = "OpsDocument.findByDocumentID", query = "SELECT o FROM OpsDocument o WHERE o.documentID = :documentID")
    , @NamedQuery(name = "OpsDocument.findByReferenceCode", query = "SELECT o FROM OpsDocument o WHERE o.referenceCode = :referenceCode")
    , @NamedQuery(name = "OpsDocument.findByFilePath", query = "SELECT o FROM OpsDocument o WHERE o.filePath = :filePath")
    , @NamedQuery(name = "OpsDocument.findByDataSource", query = "SELECT o FROM OpsDocument o WHERE o.dataSource = :dataSource")
    , @NamedQuery(name = "OpsDocument.findByIsActive", query = "SELECT o FROM OpsDocument o WHERE o.isActive = :isActive")})
public class OpsDocument implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name ="\"DocumentID\"")
    private BigDecimal documentID;
    @Basic(optional = false)
    @Column(name ="\"ReferenceCode\"")
    private String referenceCode;
    @Basic(optional = false)
    @Column(name ="\"FilePath\"")
    private String filePath;
    @Column(name ="\"DataSource\"")
    private String dataSource;
    @Basic(optional = false)
    @Column(name ="\"IsActive\"")
    private BigInteger isActive;

    public OpsDocument() {
    }

    public OpsDocument(BigDecimal documentID) {
        this.documentID = documentID;
    }

    public OpsDocument(BigDecimal documentID, String referenceCode, String filePath, BigInteger isActive) {
        this.documentID = documentID;
        this.referenceCode = referenceCode;
        this.filePath = filePath;
        this.isActive = isActive;
    }

    public BigDecimal getDocumentID() {
        return documentID;
    }

    public void setDocumentID(BigDecimal documentID) {
        this.documentID = documentID;
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public BigInteger getIsActive() {
        return isActive;
    }

    public void setIsActive(BigInteger isActive) {
        this.isActive = isActive;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentID != null ? documentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsDocument)) {
            return false;
        }
        OpsDocument other = (OpsDocument) object;
        if ((this.documentID == null && other.documentID != null) || (this.documentID != null && !this.documentID.equals(other.documentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsDocument[ documentID=" + documentID + " ]";
    }
    
}
