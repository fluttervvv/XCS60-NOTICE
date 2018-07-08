/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60notice.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "\"mas_dutyunit\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "MasDutyunit.findAll", query = "SELECT m FROM MasDutyunit m")
    , @NamedQuery(name = "MasDutyunit.findByDutyUnitCode", query = "SELECT m FROM MasDutyunit m WHERE m.dutyUnitCode = :dutyUnitCode")
    , @NamedQuery(name = "MasDutyunit.findByDutyCode", query = "SELECT m FROM MasDutyunit m WHERE m.dutyCode = :dutyCode")
    , @NamedQuery(name = "MasDutyunit.findByDutyStatus", query = "SELECT m FROM MasDutyunit m WHERE m.dutyStatus = :dutyStatus")
    , @NamedQuery(name = "MasDutyunit.findByEffectiveDate", query = "SELECT m FROM MasDutyunit m WHERE m.effectiveDate = :effectiveDate")
    , @NamedQuery(name = "MasDutyunit.findByExpirationDate", query = "SELECT m FROM MasDutyunit m WHERE m.expirationDate = :expirationDate")
    , @NamedQuery(name = "MasDutyunit.findByIsActive", query = "SELECT m FROM MasDutyunit m WHERE m.isActive = :isActive")
    , @NamedQuery(name = "MasDutyunit.findByEventDatetime", query = "SELECT m FROM MasDutyunit m WHERE m.eventDatetime = :eventDatetime")})
public class MasDutyunit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name ="\"DutyUnitCode\"")
    private String dutyUnitCode;
    @Basic(optional = false)
    @Column(name ="\"DutyCode\"")
    private String dutyCode;
    @Column(name ="\"DutyStatus\"")
    private String dutyStatus;
    @Column(name ="\"EffectiveDate\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date effectiveDate;
    @Column(name ="\"ExpirationDate\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirationDate;
    @Basic(optional = false)
    @Column(name ="\"IsActive\"")
    private short isActive;
    @Column(name ="\"EventDatetime\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventDatetime;

    public MasDutyunit() {
    }

    public MasDutyunit(String dutyUnitCode) {
        this.dutyUnitCode = dutyUnitCode;
    }

    public MasDutyunit(String dutyUnitCode, String dutyCode, short isActive) {
        this.dutyUnitCode = dutyUnitCode;
        this.dutyCode = dutyCode;
        this.isActive = isActive;
    }

    public String getDutyUnitCode() {
        return dutyUnitCode;
    }

    public void setDutyUnitCode(String dutyUnitCode) {
        this.dutyUnitCode = dutyUnitCode;
    }

    public String getDutyCode() {
        return dutyCode;
    }

    public void setDutyCode(String dutyCode) {
        this.dutyCode = dutyCode;
    }

    public String getDutyStatus() {
        return dutyStatus;
    }

    public void setDutyStatus(String dutyStatus) {
        this.dutyStatus = dutyStatus;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

    public Date getEventDatetime() {
        return eventDatetime;
    }

    public void setEventDatetime(Date eventDatetime) {
        this.eventDatetime = eventDatetime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dutyUnitCode != null ? dutyUnitCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasDutyunit)) {
            return false;
        }
        MasDutyunit other = (MasDutyunit) object;
        if ((this.dutyUnitCode == null && other.dutyUnitCode != null) || (this.dutyUnitCode != null && !this.dutyUnitCode.equals(other.dutyUnitCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.MasDutyunit[ dutyUnitCode=" + dutyUnitCode + " ]";
    }
    
}
