/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60notice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
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

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"ops_requestbribe\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "OpsRequestbribe.findAll", query = "SELECT o FROM OpsRequestbribe o")
    , @NamedQuery(name = "OpsRequestbribe.findByRequestBribeCode", query = "SELECT o FROM OpsRequestbribe o WHERE o.requestBribeCode = :requestBribeCode")
    , @NamedQuery(name = "OpsRequestbribe.findByRequestDate", query = "SELECT o FROM OpsRequestbribe o WHERE o.requestDate = :requestDate")
    , @NamedQuery(name = "OpsRequestbribe.findByStationCode", query = "SELECT o FROM OpsRequestbribe o WHERE o.stationCode = :stationCode")
    , @NamedQuery(name = "OpsRequestbribe.findByStation", query = "SELECT o FROM OpsRequestbribe o WHERE o.station = :station")
    , @NamedQuery(name = "OpsRequestbribe.findByBribeTotal", query = "SELECT o FROM OpsRequestbribe o WHERE o.bribeTotal = :bribeTotal")
    , @NamedQuery(name = "OpsRequestbribe.findByIsActive", query = "SELECT o FROM OpsRequestbribe o WHERE o.isActive = :isActive")
    , @NamedQuery(name = "OpsRequestbribe.findByFineType", query = "SELECT o FROM OpsRequestbribe o WHERE o.fineType = :fineType")
    , @NamedQuery(name = "OpsRequestbribe.findByBribeRemiander", query = "SELECT o FROM OpsRequestbribe o WHERE o.bribeRemiander = :bribeRemiander")})
public class OpsRequestbribe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name ="\"RequestBribeCode\"")
    private String requestBribeCode;
    @Basic(optional = false)
    @Column(name ="\"RequestDate\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestDate;
    @Column(name ="\"StationCode\"")
    private String stationCode;
    @Column(name ="\"Station\"")
    private String station;
    @Basic(optional = false)
    @Column(name ="\"BribeTotal\"")
    private double bribeTotal;
    @Column(name ="\"IsActive\"")
    private Short isActive;
    @Column(name ="\"FineType\"")
    private Short fineType;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name ="\"BribeRemiander\"")
    private Double bribeRemiander;
    
//    @JoinColumn(name ="\"LawsuitID", referencedColumnName ="\"LawsuitID\"")
//    @ManyToOne
    
    @Column(name="\"LawsuitID\"")
    private BigDecimal lawsuitID;
    
    @OneToMany(mappedBy = "requestBribeCode")
    private Collection<OpsRequestbribeDetail> opsRequestbribeDetailCollection;
    
    @OneToMany(mappedBy = "requestBribeCode")
    private Collection<OpsRequestbribeStaff> opsRequestbribeStaffCollection;
    
    @OneToMany(mappedBy = "requestBribeCode")
    private Collection<OpsRequestrebribeFine> opsRequestrebribeFineCollection;

    public OpsRequestbribe() {
    }

    public OpsRequestbribe(String requestBribeCode) {
        this.requestBribeCode = requestBribeCode;
    }

    public OpsRequestbribe(String requestBribeCode, Date requestDate, double bribeTotal) {
        this.requestBribeCode = requestBribeCode;
        this.requestDate = requestDate;
        this.bribeTotal = bribeTotal;
    }

    public String getRequestBribeCode() {
        return requestBribeCode;
    }

    public void setRequestBribeCode(String requestBribeCode) {
        this.requestBribeCode = requestBribeCode;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public double getBribeTotal() {
        return bribeTotal;
    }

    public void setBribeTotal(double bribeTotal) {
        this.bribeTotal = bribeTotal;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }

    public Short getFineType() {
        return fineType;
    }

    public void setFineType(Short fineType) {
        this.fineType = fineType;
    }

    public Double getBribeRemiander() {
        return bribeRemiander;
    }

    public void setBribeRemiander(Double bribeRemiander) {
        this.bribeRemiander = bribeRemiander;
    }

    public BigDecimal getLawsuitID() {
        return lawsuitID;
    }

    public void setLawsuitID(BigDecimal lawsuitID) {
        this.lawsuitID = lawsuitID;
    }

    public Collection<OpsRequestbribeDetail> getOpsRequestbribeDetailCollection() {
        return opsRequestbribeDetailCollection;
    }

    public void setOpsRequestbribeDetailCollection(Collection<OpsRequestbribeDetail> opsRequestbribeDetailCollection) {
        this.opsRequestbribeDetailCollection = opsRequestbribeDetailCollection;
    }


    public Collection<OpsRequestbribeStaff> getOpsRequestbribeStaffCollection() {
        return opsRequestbribeStaffCollection;
    }

    public void setOpsRequestbribeStaffCollection(Collection<OpsRequestbribeStaff> opsRequestbribeStaffCollection) {
        this.opsRequestbribeStaffCollection = opsRequestbribeStaffCollection;
    }


    public Collection<OpsRequestrebribeFine> getOpsRequestrebribeFineCollection() {
        return opsRequestrebribeFineCollection;
    }

    public void setOpsRequestrebribeFineCollection(Collection<OpsRequestrebribeFine> opsRequestrebribeFineCollection) {
        this.opsRequestrebribeFineCollection = opsRequestrebribeFineCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requestBribeCode != null ? requestBribeCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsRequestbribe)) {
            return false;
        }
        OpsRequestbribe other = (OpsRequestbribe) object;
        if ((this.requestBribeCode == null && other.requestBribeCode != null) || (this.requestBribeCode != null && !this.requestBribeCode.equals(other.requestBribeCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsRequestbribe[ requestBribeCode=" + requestBribeCode + " ]";
    }
    
}
