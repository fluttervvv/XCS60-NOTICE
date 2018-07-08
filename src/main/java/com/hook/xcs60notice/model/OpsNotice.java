/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60notice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"ops_notice\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "OpsNotice.findAll", query = "SELECT o FROM OpsNotice o")
    , @NamedQuery(name = "OpsNotice.findByNoticeCode", query = "SELECT o FROM OpsNotice o WHERE o.noticeCode = :noticeCode")
    , @NamedQuery(name = "OpsNotice.findByNoticeStationCode", query = "SELECT o FROM OpsNotice o WHERE o.noticeStationCode = :noticeStationCode")
    , @NamedQuery(name = "OpsNotice.findByNoticeStation", query = "SELECT o FROM OpsNotice o WHERE o.noticeStation = :noticeStation")
    , @NamedQuery(name = "OpsNotice.findByNoticeDate", query = "SELECT o FROM OpsNotice o WHERE o.noticeDate = :noticeDate")
    , @NamedQuery(name = "OpsNotice.findByNoticeTime", query = "SELECT o FROM OpsNotice o WHERE o.noticeTime = :noticeTime")
    , @NamedQuery(name = "OpsNotice.findByNoticeDue", query = "SELECT o FROM OpsNotice o WHERE o.noticeDue = :noticeDue")
    , @NamedQuery(name = "OpsNotice.findByNoticeDueDate", query = "SELECT o FROM OpsNotice o WHERE o.noticeDueDate = :noticeDueDate")
    , @NamedQuery(name = "OpsNotice.findByIsArrest", query = "SELECT o FROM OpsNotice o WHERE o.isArrest = :isArrest")
    , @NamedQuery(name = "OpsNotice.findByIsActive", query = "SELECT o FROM OpsNotice o WHERE o.isActive = :isActive")})
public class OpsNotice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name ="\"NoticeCode\"")
    private String noticeCode;
    
    @Basic(optional = false)
    @Column(name ="\"NoticeStationCode\"")
    private String noticeStationCode;
    @Basic(optional = false)
    @Column(name ="\"NoticeStation\"")
    private String noticeStation;
    @Basic(optional = false)
    @Column(name ="\"NoticeDate\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date noticeDate;
    @Basic(optional = false)
    @Column(name ="\"NoticeTime\"")
    private String noticeTime;
    @Basic(optional = false)
    @Column(name ="\"NoticeDue\"")
    private BigInteger noticeDue;
    @Basic(optional = false)
    @Column(name ="\"NoticeDueDate\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date noticeDueDate;
    @Basic(optional = false)
    @Column(name ="\"IsArrest\"")
    private short isArrest;
    @Column(name ="\"IsActive\"")
    private Short isActive;
    
   
//    
//    @JoinColumn(name = "CommunicationChanelID", referencedColumnName = "CommunicationChanelID")
//    @ManyToOne
    
    @Column(name = "\"CommunicationChanelID\"")
    private BigDecimal communicationChanelID;
    
//    @JoinColumn(name = "ArrestCode", referencedColumnName = "ArrestCode")
//    @ManyToOne
//    
    @Column(name = "\"ArrestCode\"")
    private String arrestCode;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noticeCode")
    @JsonProperty("NoticeSuspect")
    private Collection<OpsNoticeSuspect> opsNoticeSuspectCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noticeCode")
    @JsonProperty("NoticeLocale")
    private Collection<OpsNoticeLocale> opsNoticeLocaleCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noticeCode")
    @JsonProperty("NoticeInformer")
    private Collection<OpsNoticeInformer> opsNoticeInformerCollection;
    
//   
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noticeCode")
//    private Collection<OpsRequestbribeDetail> opsRequestbribeDetailCollection;
//    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noticeCode")
    @JsonProperty("NoticeStaff")
    private Collection<OpsNoticeStaff> opsNoticeStaffCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "noticeCode")
    @JsonProperty("NoticeProduct")
    private Collection<OpsNoticeProduct> opsNoticeProductCollection;
    
//    @OneToMany(mappedBy = "noticeCode")
//    private Collection<OpsArrest> opsArrestCollection;

    public OpsNotice() {
    }

    public OpsNotice(String noticeCode) {
        this.noticeCode = noticeCode;
    }

    public OpsNotice(String noticeCode, String noticeStationCode, String noticeStation, Date noticeDate, String noticeTime, BigInteger noticeDue, Date noticeDueDate, short isArrest) {
        this.noticeCode = noticeCode;
        this.noticeStationCode = noticeStationCode;
        this.noticeStation = noticeStation;
        this.noticeDate = noticeDate;
        this.noticeTime = noticeTime;
        this.noticeDue = noticeDue;
        this.noticeDueDate = noticeDueDate;
        this.isArrest = isArrest;
    }

    public String getNoticeCode() {
        return noticeCode;
    }

    public void setNoticeCode(String noticeCode) {
        this.noticeCode = noticeCode;
    }

    public String getNoticeStationCode() {
        return noticeStationCode;
    }

    public void setNoticeStationCode(String noticeStationCode) {
        this.noticeStationCode = noticeStationCode;
    }

    public String getNoticeStation() {
        return noticeStation;
    }

    public void setNoticeStation(String noticeStation) {
        this.noticeStation = noticeStation;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    public BigInteger getNoticeDue() {
        return noticeDue;
    }

    public void setNoticeDue(BigInteger noticeDue) {
        this.noticeDue = noticeDue;
    }

    public Date getNoticeDueDate() {
        return noticeDueDate;
    }

    public void setNoticeDueDate(Date noticeDueDate) {
        this.noticeDueDate = noticeDueDate;
    }

    public short getIsArrest() {
        return isArrest;
    }

    public void setIsArrest(short isArrest) {
        this.isArrest = isArrest;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }

 
    public Collection<OpsNoticeSuspect> getOpsNoticeSuspectCollection() {
        return opsNoticeSuspectCollection;
    }

    public void setOpsNoticeSuspectCollection(Collection<OpsNoticeSuspect> opsNoticeSuspectCollection) {
        this.opsNoticeSuspectCollection = opsNoticeSuspectCollection;
    }

    public BigDecimal getCommunicationChanelID() {
        return communicationChanelID;
    }

    public void setCommunicationChanelID(BigDecimal communicationChanelID) {
        this.communicationChanelID = communicationChanelID;
    }

    public String getArrestCode() {
        return arrestCode;
    }

    public void setArrestCode(String arrestCode) {
        this.arrestCode = arrestCode;
    }

    
    public Collection<OpsNoticeLocale> getOpsNoticeLocaleCollection() {
        return opsNoticeLocaleCollection;
    }

    public void setOpsNoticeLocaleCollection(Collection<OpsNoticeLocale> opsNoticeLocaleCollection) {
        this.opsNoticeLocaleCollection = opsNoticeLocaleCollection;
    }


    public Collection<OpsNoticeInformer> getOpsNoticeInformerCollection() {
        return opsNoticeInformerCollection;
    }

    public void setOpsNoticeInformerCollection(Collection<OpsNoticeInformer> opsNoticeInformerCollection) {
        this.opsNoticeInformerCollection = opsNoticeInformerCollection;
    }

//    public Collection<OpsRequestbribeDetail> getOpsRequestbribeDetailCollection() {
//        return opsRequestbribeDetailCollection;
//    }
//
//    public void setOpsRequestbribeDetailCollection(Collection<OpsRequestbribeDetail> opsRequestbribeDetailCollection) {
//        this.opsRequestbribeDetailCollection = opsRequestbribeDetailCollection;
//    }

    public Collection<OpsNoticeStaff> getOpsNoticeStaffCollection() {
        return opsNoticeStaffCollection;
    }

    public void setOpsNoticeStaffCollection(Collection<OpsNoticeStaff> opsNoticeStaffCollection) {
        this.opsNoticeStaffCollection = opsNoticeStaffCollection;
    }


    public Collection<OpsNoticeProduct> getOpsNoticeProductCollection() {
        return opsNoticeProductCollection;
    }

    public void setOpsNoticeProductCollection(Collection<OpsNoticeProduct> opsNoticeProductCollection) {
        this.opsNoticeProductCollection = opsNoticeProductCollection;
    }


//    public Collection<OpsArrest> getOpsArrestCollection() {
//        return opsArrestCollection;
//    }
//
//    public void setOpsArrestCollection(Collection<OpsArrest> opsArrestCollection) {
//        this.opsArrestCollection = opsArrestCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noticeCode != null ? noticeCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsNotice)) {
            return false;
        }
        OpsNotice other = (OpsNotice) object;
        if ((this.noticeCode == null && other.noticeCode != null) || (this.noticeCode != null && !this.noticeCode.equals(other.noticeCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsNotice[ noticeCode=" + noticeCode + " ]";
    }
    
}
