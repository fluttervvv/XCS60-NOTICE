/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60notice.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin 
 */
@Entity
@Table(name = "\"ops_notice_suspect\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "OpsNoticeSuspect.findAll", query = "SELECT o FROM OpsNoticeSuspect o")
    , @NamedQuery(name = "OpsNoticeSuspect.findBySuspectID", query = "SELECT o FROM OpsNoticeSuspect o WHERE o.suspectID = :suspectID")
    , @NamedQuery(name = "OpsNoticeSuspect.findBySuspectReferenceID", query = "SELECT o FROM OpsNoticeSuspect o WHERE o.suspectReferenceID = :suspectReferenceID")
    , @NamedQuery(name = "OpsNoticeSuspect.findBySuspectTitleName", query = "SELECT o FROM OpsNoticeSuspect o WHERE o.suspectTitleName = :suspectTitleName")
    , @NamedQuery(name = "OpsNoticeSuspect.findBySuspectFirstName", query = "SELECT o FROM OpsNoticeSuspect o WHERE o.suspectFirstName = :suspectFirstName")
    , @NamedQuery(name = "OpsNoticeSuspect.findBySuspectLastName", query = "SELECT o FROM OpsNoticeSuspect o WHERE o.suspectLastName = :suspectLastName")
    , @NamedQuery(name = "OpsNoticeSuspect.findByCompanyTitleName", query = "SELECT o FROM OpsNoticeSuspect o WHERE o.companyTitleName = :companyTitleName")
    , @NamedQuery(name = "OpsNoticeSuspect.findByCompanyName", query = "SELECT o FROM OpsNoticeSuspect o WHERE o.companyName = :companyName")
    , @NamedQuery(name = "OpsNoticeSuspect.findByCompanyOtherName", query = "SELECT o FROM OpsNoticeSuspect o WHERE o.companyOtherName = :companyOtherName")
    , @NamedQuery(name = "OpsNoticeSuspect.findByIsActive", query = "SELECT o FROM OpsNoticeSuspect o WHERE o.isActive = :isActive")})
@SequenceGenerator(name = "noticeSuspectID_Sequence", schema = "ILLEGAL60", sequenceName = "\"ops_notice_suspect_SEQ\"", initialValue = 1, allocationSize = 1)
public class OpsNoticeSuspect implements Serializable {

	//ops_notice_suspect_SEQ
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name ="\"SuspectID\"")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "noticeSuspectID_Sequence")
    private Short suspectID;
    @Basic(optional = false)
    @Column(name ="\"SuspectReferenceID\"")
    private short suspectReferenceID;
    @Column(name ="\"SuspectTitleName\"")
    private String suspectTitleName;
    @Column(name ="\"SuspectFirstName\"")
    private String suspectFirstName;
    @Column(name ="\"SuspectLastName\"")
    private String suspectLastName;
    @Column(name ="\"CompanyTitleName\"")
    private String companyTitleName;
    @Column(name ="\"CompanyName\"")
    private String companyName;
    @Column(name ="\"CompanyOtherName\"")
    private String companyOtherName;
    @Column(name ="\"IsActive\"")
    private Short isActive;
    
//    @JoinColumn(name = "NoticeCode", referencedColumnName = "NoticeCode")
//    @ManyToOne(optional = false)
    
    @Column(name = "\"NoticeCode\"")
    private String noticeCode;

    public OpsNoticeSuspect() {
    }

    public OpsNoticeSuspect(Short suspectID) {
        this.suspectID = suspectID;
    }

    public OpsNoticeSuspect(Short suspectID, short suspectReferenceID) {
        this.suspectID = suspectID;
        this.suspectReferenceID = suspectReferenceID;
    }

    public Short getSuspectID() {
        return suspectID;
    }

    public void setSuspectID(Short suspectID) {
        this.suspectID = suspectID;
    }

    public short getSuspectReferenceID() {
        return suspectReferenceID;
    }

    public void setSuspectReferenceID(short suspectReferenceID) {
        this.suspectReferenceID = suspectReferenceID;
    }

    public String getSuspectTitleName() {
        return suspectTitleName;
    }

    public void setSuspectTitleName(String suspectTitleName) {
        this.suspectTitleName = suspectTitleName;
    }

    public String getSuspectFirstName() {
        return suspectFirstName;
    }

    public void setSuspectFirstName(String suspectFirstName) {
        this.suspectFirstName = suspectFirstName;
    }

    public String getSuspectLastName() {
        return suspectLastName;
    }

    public void setSuspectLastName(String suspectLastName) {
        this.suspectLastName = suspectLastName;
    }

    public String getCompanyTitleName() {
        return companyTitleName;
    }

    public void setCompanyTitleName(String companyTitleName) {
        this.companyTitleName = companyTitleName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyOtherName() {
        return companyOtherName;
    }

    public void setCompanyOtherName(String companyOtherName) {
        this.companyOtherName = companyOtherName;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }

    public String getNoticeCode() {
        return noticeCode;
    }

    public void setNoticeCode(String noticeCode) {
        this.noticeCode = noticeCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (suspectID != null ? suspectID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsNoticeSuspect)) {
            return false;
        }
        OpsNoticeSuspect other = (OpsNoticeSuspect) object;
        if ((this.suspectID == null && other.suspectID != null) || (this.suspectID != null && !this.suspectID.equals(other.suspectID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsNoticeSuspect[ suspectID=" + suspectID + " ]";
    }
    
}
