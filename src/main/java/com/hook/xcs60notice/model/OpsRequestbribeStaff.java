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
@Table(name = "\"ops_requestbribe_staff\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "OpsRequestbribeStaff.findAll", query = "SELECT o FROM OpsRequestbribeStaff o")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByStaffID", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.staffID = :staffID")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByProgramCode", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.programCode = :programCode")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByProcessCode", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.processCode = :processCode")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByTitleName", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.titleName = :titleName")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByFirstName", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.firstName = :firstName")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByLastName", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.lastName = :lastName")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByPositionCode", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.positionCode = :positionCode")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByPositionName", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.positionName = :positionName")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByPosLevel", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.posLevel = :posLevel")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByPosLevelName", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.posLevelName = :posLevelName")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByDepartmentCode", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.departmentCode = :departmentCode")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByDepartmentName", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.departmentName = :departmentName")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByDepartmentLevel", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.departmentLevel = :departmentLevel")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByOfficeCode", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.officeCode = :officeCode")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByOfficeName", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.officeName = :officeName")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByOfficeShortName", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.officeShortName = :officeShortName")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByContributorID", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.contributorID = :contributorID")
    , @NamedQuery(name = "OpsRequestbribeStaff.findByIsActive", query = "SELECT o FROM OpsRequestbribeStaff o WHERE o.isActive = :isActive")})
@SequenceGenerator(name = "requestbribeStaff_Sequence", schema = "ILLEGAL60", sequenceName = "\"ops_requestbribe_staff_SEQ\"", initialValue = 1, allocationSize = 1)
public class OpsRequestbribeStaff implements Serializable {

	//ops_requestbribe_staff_SEQ
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name ="\"StaffID\"")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="requestbribeStaff_Sequence")
    private BigDecimal staffID;
    @Column(name ="\"ProgramCode\"")
    private String programCode;
    @Column(name ="\"ProcessCode\"")
    private String processCode;
    @Column(name ="\"TitleName\"")
    private String titleName;
    @Basic(optional = false)
    @Column(name ="\"FirstName\"")
    private String firstName;
    @Basic(optional = false)
    @Column(name ="\"LastName\"")
    private String lastName;
    @Column(name ="\"PositionCode\"")
    private String positionCode;
    @Column(name ="\"PositionName\"")
    private String positionName;
    @Column(name ="\"PosLevel\"")
    private String posLevel;
    @Column(name ="\"PosLevelName\"")
    private String posLevelName;
    @Column(name ="\"DepartmentCode\"")
    private String departmentCode;
    @Column(name ="\"DepartmentName\"")
    private String departmentName;
    @Column(name ="\"DepartmentLevel\"")
    private String departmentLevel;
    @Column(name ="\"OfficeCode\"")
    private String officeCode;
    @Column(name ="\"OfficeName\"")
    private String officeName;
    @Column(name ="\"OfficeShortName\"")
    private String officeShortName;
    @Column(name ="\"ContributorID\"")
    private BigInteger contributorID;
    @Basic(optional = false)
    @Column(name ="\"IsActive\"")
    private short isActive;
    
//    @JoinColumn(name ="\"StaffCode", referencedColumnName ="\"StaffCode\"")
//    @ManyToOne(optional = false)
    @Column(name ="\"StaffCode\"")
    private String staffCode;
//    
//    @JoinColumn(name = "RequestBribeCode", referencedColumnName = "RequestBribeCode")
//    @ManyToOne
    @Column(name= "\"RequestBribeCode\"")
    private OpsRequestbribe requestBribeCode;
    

    public OpsRequestbribeStaff() {
    }

    public OpsRequestbribeStaff(BigDecimal staffID) {
        this.staffID = staffID;
    }

    public OpsRequestbribeStaff(BigDecimal staffID, String firstName, String lastName, short isActive) {
        this.staffID = staffID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
    }

    public BigDecimal getStaffID() {
        return staffID;
    }

    public void setStaffID(BigDecimal staffID) {
        this.staffID = staffID;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPosLevel() {
        return posLevel;
    }

    public void setPosLevel(String posLevel) {
        this.posLevel = posLevel;
    }

    public String getPosLevelName() {
        return posLevelName;
    }

    public void setPosLevelName(String posLevelName) {
        this.posLevelName = posLevelName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentLevel() {
        return departmentLevel;
    }

    public void setDepartmentLevel(String departmentLevel) {
        this.departmentLevel = departmentLevel;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficeShortName() {
        return officeShortName;
    }

    public void setOfficeShortName(String officeShortName) {
        this.officeShortName = officeShortName;
    }

    public BigInteger getContributorID() {
        return contributorID;
    }

    public void setContributorID(BigInteger contributorID) {
        this.contributorID = contributorID;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
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
        hash += (staffID != null ? staffID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsRequestbribeStaff)) {
            return false;
        }
        OpsRequestbribeStaff other = (OpsRequestbribeStaff) object;
        if ((this.staffID == null && other.staffID != null) || (this.staffID != null && !this.staffID.equals(other.staffID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsRequestbribeStaff[ staffID=" + staffID + " ]";
    }
    
}
