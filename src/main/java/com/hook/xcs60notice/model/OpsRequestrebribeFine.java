/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60notice.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "\"ops_requestrebribe_fine\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "OpsRequestrebribeFine.findAll", query = "SELECT o FROM OpsRequestrebribeFine o")
    , @NamedQuery(name = "OpsRequestrebribeFine.findByRequestBribeFineID", query = "SELECT o FROM OpsRequestrebribeFine o WHERE o.requestBribeFineID = :requestBribeFineID")
    , @NamedQuery(name = "OpsRequestrebribeFine.findByIsActive", query = "SELECT o FROM OpsRequestrebribeFine o WHERE o.isActive = :isActive")})
@SequenceGenerator(name = "requestBribeFineID_Sequence", schema = "ILLEGAL60", sequenceName = "\"ops_requestrebribe_fine_SEQ\"", initialValue = 1, allocationSize = 1)
public class OpsRequestrebribeFine implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "\"RequestBribeFineID\"")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="requestBribeFineID_Sequence")
    private BigDecimal requestBribeFineID;
    @Basic(optional = false)
    @Column(name = "\"IsActive\"")
    private short isActive;
//    
//    @JoinColumn(name = "PaymentFineID", referencedColumnName = "PaymentfineID")
//    @ManyToOne
    @Column(name = "\"PaymentFineID\"")
    private BigDecimal paymentFineID;
    
//    @JoinColumn(name = "RequestBribeCode", referencedColumnName = "RequestBribeCode")
//    @ManyToOne
    @Column(name = "\"RequestBribeCode\"")
    private OpsRequestbribe requestBribeCode;

    public OpsRequestrebribeFine() {
    }

    public OpsRequestrebribeFine(BigDecimal requestBribeFineID) {
        this.requestBribeFineID = requestBribeFineID;
    }

    public OpsRequestrebribeFine(BigDecimal requestBribeFineID, short isActive) {
        this.requestBribeFineID = requestBribeFineID;
        this.isActive = isActive;
    }

    public BigDecimal getRequestBribeFineID() {
        return requestBribeFineID;
    }

    public void setRequestBribeFineID(BigDecimal requestBribeFineID) {
        this.requestBribeFineID = requestBribeFineID;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

    public BigDecimal getPaymentFineID() {
        return paymentFineID;
    }

    public void setPaymentFineID(BigDecimal paymentFineID) {
        this.paymentFineID = paymentFineID;
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
        hash += (requestBribeFineID != null ? requestBribeFineID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsRequestrebribeFine)) {
            return false;
        }
        OpsRequestrebribeFine other = (OpsRequestrebribeFine) object;
        if ((this.requestBribeFineID == null && other.requestBribeFineID != null) || (this.requestBribeFineID != null && !this.requestBribeFineID.equals(other.requestBribeFineID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsRequestrebribeFine[ requestBribeFineID=" + requestBribeFineID + " ]";
    }
    
}
