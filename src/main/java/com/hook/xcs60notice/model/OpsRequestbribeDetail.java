/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60notice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"ops_requestbribe_detail\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "OpsRequestbribeDetail.findAll", query = "SELECT o FROM OpsRequestbribeDetail o")
    , @NamedQuery(name = "OpsRequestbribeDetail.findByRequestBribeDetailID", query = "SELECT o FROM OpsRequestbribeDetail o WHERE o.requestBribeDetailID = :requestBribeDetailID")
    , @NamedQuery(name = "OpsRequestbribeDetail.findByPartMoney", query = "SELECT o FROM OpsRequestbribeDetail o WHERE o.partMoney = :partMoney")
    , @NamedQuery(name = "OpsRequestbribeDetail.findByDateReceiveMoney", query = "SELECT o FROM OpsRequestbribeDetail o WHERE o.dateReceiveMoney = :dateReceiveMoney")
    , @NamedQuery(name = "OpsRequestbribeDetail.findByIsActive", query = "SELECT o FROM OpsRequestbribeDetail o WHERE o.isActive = :isActive")
    , @NamedQuery(name = "OpsRequestbribeDetail.findByTotalMoney", query = "SELECT o FROM OpsRequestbribeDetail o WHERE o.totalMoney = :totalMoney")})
@SequenceGenerator(name = "requestBribeDetailID_Sequence", schema = "ILLEGAL60", sequenceName = "\"ops_requestbribe_detail_SEQ\"", initialValue = 1, allocationSize = 1)
public class OpsRequestbribeDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name ="\"RequestBribeDetailID\"")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="requestBribeDetailID_Sequence")
    private BigDecimal requestBribeDetailID;
    @Basic(optional = false)
    @Column(name ="\"PartMoney\"")
    private double partMoney;
    @Column(name ="\"DateReceiveMoney\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReceiveMoney;
    @Basic(optional = false)
    @Column(name ="\"IsActive\"")
    private short isActive;
    @Column(name ="\"TotalMoney\"")
    private Double totalMoney;
    
//    @JoinColumn(name ="\"NoticeCode", referencedColumnName ="\"NoticeCode\"")
//    @ManyToOne
    @Column(name ="\"NoticeCode\"")
    private String noticeCode;
//    
//    @JoinColumn(name ="\"RequestBribeCode", referencedColumnName ="\"RequestBribeCode\"")
//    @ManyToOne
    @Column(name ="RequestBribeCode\"")
    private OpsRequestbribe requestBribeCode;

    public OpsRequestbribeDetail() {
    }

    public OpsRequestbribeDetail(BigDecimal requestBribeDetailID) {
        this.requestBribeDetailID = requestBribeDetailID;
    }

    public OpsRequestbribeDetail(BigDecimal requestBribeDetailID, double partMoney, short isActive) {
        this.requestBribeDetailID = requestBribeDetailID;
        this.partMoney = partMoney;
        this.isActive = isActive;
    }

    public BigDecimal getRequestBribeDetailID() {
        return requestBribeDetailID;
    }

    public void setRequestBribeDetailID(BigDecimal requestBribeDetailID) {
        this.requestBribeDetailID = requestBribeDetailID;
    }

    public double getPartMoney() {
        return partMoney;
    }

    public void setPartMoney(double partMoney) {
        this.partMoney = partMoney;
    }

    public Date getDateReceiveMoney() {
        return dateReceiveMoney;
    }

    public void setDateReceiveMoney(Date dateReceiveMoney) {
        this.dateReceiveMoney = dateReceiveMoney;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getNoticeCode() {
        return noticeCode;
    }

    public void setNoticeCode(String noticeCode) {
        this.noticeCode = noticeCode;
    }

    public OpsRequestbribe getRequestBribeCode() {
        return requestBribeCode;
    }

    public void setRequestBribeCode(OpsRequestbribe requestBribeCode) {
        this.requestBribeCode = requestBribeCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requestBribeDetailID != null ? requestBribeDetailID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsRequestbribeDetail)) {
            return false;
        }
        OpsRequestbribeDetail other = (OpsRequestbribeDetail) object;
        if ((this.requestBribeDetailID == null && other.requestBribeDetailID != null) || (this.requestBribeDetailID != null && !this.requestBribeDetailID.equals(other.requestBribeDetailID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsRequestbribeDetail[ requestBribeDetailID=" + requestBribeDetailID + " ]";
    }
    
}
