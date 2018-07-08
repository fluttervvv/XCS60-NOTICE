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
@Table(name = "\"ops_notice_staff\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "OpsNoticeStaff.findAll", query = "SELECT o FROM OpsNoticeStaff o")
    , @NamedQuery(name = "OpsNoticeStaff.findByStaffID", query = "SELECT o FROM OpsNoticeStaff o WHERE o.staffID = :staffID")
    , @NamedQuery(name = "OpsNoticeStaff.findByProgramCode", query = "SELECT o FROM OpsNoticeStaff o WHERE o.programCode = :programCode")
    , @NamedQuery(name = "OpsNoticeStaff.findByProcessCode", query = "SELECT o FROM OpsNoticeStaff o WHERE o.processCode = :processCode")
    , @NamedQuery(name = "OpsNoticeStaff.findByTitleName", query = "SELECT o FROM OpsNoticeStaff o WHERE o.titleName = :titleName")
    , @NamedQuery(name = "OpsNoticeStaff.findByFirstName", query = "SELECT o FROM OpsNoticeStaff o WHERE o.firstName = :firstName")
    , @NamedQuery(name = "OpsNoticeStaff.findByLastName", query = "SELECT o FROM OpsNoticeStaff o WHERE o.lastName = :lastName")
    , @NamedQuery(name = "OpsNoticeStaff.findByPositionCode", query = "SELECT o FROM OpsNoticeStaff o WHERE o.positionCode = :positionCode")
    , @NamedQuery(name = "OpsNoticeStaff.findByPositionName", query = "SELECT o FROM OpsNoticeStaff o WHERE o.positionName = :positionName")
    , @NamedQuery(name = "OpsNoticeStaff.findByPosLevel", query = "SELECT o FROM OpsNoticeStaff o WHERE o.posLevel = :posLevel")
    , @NamedQuery(name = "OpsNoticeStaff.findByPosLevelName", query = "SELECT o FROM OpsNoticeStaff o WHERE o.posLevelName = :posLevelName")
    , @NamedQuery(name = "OpsNoticeStaff.findByDepartmentCode", query = "SELECT o FROM OpsNoticeStaff o WHERE o.departmentCode = :departmentCode")
    , @NamedQuery(name = "OpsNoticeStaff.findByDepartmentName", query = "SELECT o FROM OpsNoticeStaff o WHERE o.departmentName = :departmentName")
    , @NamedQuery(name = "OpsNoticeStaff.findByDepartmentLevel", query = "SELECT o FROM OpsNoticeStaff o WHERE o.departmentLevel = :departmentLevel")
    , @NamedQuery(name = "OpsNoticeStaff.findByOfficeCode", query = "SELECT o FROM OpsNoticeStaff o WHERE o.officeCode = :officeCode")
    , @NamedQuery(name = "OpsNoticeStaff.findByOfficeName", query = "SELECT o FROM OpsNoticeStaff o WHERE o.officeName = :officeName")
    , @NamedQuery(name = "OpsNoticeStaff.findByOfficeShortName", query = "SELECT o FROM OpsNoticeStaff o WHERE o.officeShortName = :officeShortName")
    , @NamedQuery(name = "OpsNoticeStaff.findByContributorID", query = "SELECT o FROM OpsNoticeStaff o WHERE o.contributorID = :contributorID")
    , @NamedQuery(name = "OpsNoticeStaff.findByIsActive", query = "SELECT o FROM OpsNoticeStaff o WHERE o.isActive = :isActive")})
@SequenceGenerator(name = "noticeStaffId_Sequence", schema = "ILLEGAL60", sequenceName = "\"ops_notice_staff_SEQ\"", initialValue = 1, allocationSize = 1)
public class OpsNoticeStaff implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name ="\"StaffID\"")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="noticeStaffId_Sequence")
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
    private Character contributorID;
    @Basic(optional = false)
    @Column(name ="\"IsActive\"")
    private short isActive;
    
//    @JoinColumn(name ="\"StaffCode", referencedColumnName ="\"StaffCode\"")
//    @ManyToOne(optional = false)
    @Column(name ="\"StaffCode\"")
    private String staffCode;
    
//    @JoinColumn(name ="\"NoticeCode", referencedColumnName ="\"NoticeCode\"")
//    @ManyToOne(optional = false)
    @Column(name ="\"NoticeCode\"")
    private String noticeCode;

    public OpsNoticeStaff() {
    }

    public OpsNoticeStaff(BigDecimal staffID) {
        this.staffID = staffID;
    }

    public OpsNoticeStaff(BigDecimal staffID, String firstName, String lastName, short isActive) {
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

    public Character getContributorID() {
        return contributorID;
    }

    public void setContributorID(Character contributorID) {
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

    public String getNoticeCode() {
        return noticeCode;
    }

    public void setNoticeCode(String noticeCode) {
        this.noticeCode = noticeCode;
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
        if (!(object instanceof OpsNoticeStaff)) {
            return false;
        }
        OpsNoticeStaff other = (OpsNoticeStaff) object;
        if ((this.staffID == null && other.staffID != null) || (this.staffID != null && !this.staffID.equals(other.staffID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsNoticeStaff[ staffID=" + staffID + " ]";
    }
    
}
