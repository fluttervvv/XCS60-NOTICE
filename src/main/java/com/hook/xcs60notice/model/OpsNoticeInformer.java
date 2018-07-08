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
@Table(name = "\"ops_notice_informer\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "OpsNoticeInformer.findAll", query = "SELECT o FROM OpsNoticeInformer o")
    , @NamedQuery(name = "OpsNoticeInformer.findByInformerID", query = "SELECT o FROM OpsNoticeInformer o WHERE o.informerID = :informerID")
    , @NamedQuery(name = "OpsNoticeInformer.findByInformerType", query = "SELECT o FROM OpsNoticeInformer o WHERE o.informerType = :informerType")
    , @NamedQuery(name = "OpsNoticeInformer.findByTitleCode", query = "SELECT o FROM OpsNoticeInformer o WHERE o.titleCode = :titleCode")
    , @NamedQuery(name = "OpsNoticeInformer.findByTitleName", query = "SELECT o FROM OpsNoticeInformer o WHERE o.titleName = :titleName")
    , @NamedQuery(name = "OpsNoticeInformer.findByFirstName", query = "SELECT o FROM OpsNoticeInformer o WHERE o.firstName = :firstName")
    , @NamedQuery(name = "OpsNoticeInformer.findByLastName", query = "SELECT o FROM OpsNoticeInformer o WHERE o.lastName = :lastName")
    , @NamedQuery(name = "OpsNoticeInformer.findByIDCard", query = "SELECT o FROM OpsNoticeInformer o WHERE o.iDCard = :iDCard")
    , @NamedQuery(name = "OpsNoticeInformer.findByAge", query = "SELECT o FROM OpsNoticeInformer o WHERE o.age = :age")
    , @NamedQuery(name = "OpsNoticeInformer.findByGenderType", query = "SELECT o FROM OpsNoticeInformer o WHERE o.genderType = :genderType")
    , @NamedQuery(name = "OpsNoticeInformer.findByLocation", query = "SELECT o FROM OpsNoticeInformer o WHERE o.location = :location")
    , @NamedQuery(name = "OpsNoticeInformer.findByAddress", query = "SELECT o FROM OpsNoticeInformer o WHERE o.address = :address")
    , @NamedQuery(name = "OpsNoticeInformer.findByVillage", query = "SELECT o FROM OpsNoticeInformer o WHERE o.village = :village")
    , @NamedQuery(name = "OpsNoticeInformer.findByBuilding", query = "SELECT o FROM OpsNoticeInformer o WHERE o.building = :building")
    , @NamedQuery(name = "OpsNoticeInformer.findByFloor", query = "SELECT o FROM OpsNoticeInformer o WHERE o.floor = :floor")
    , @NamedQuery(name = "OpsNoticeInformer.findByRoom", query = "SELECT o FROM OpsNoticeInformer o WHERE o.room = :room")
    , @NamedQuery(name = "OpsNoticeInformer.findByAlley", query = "SELECT o FROM OpsNoticeInformer o WHERE o.alley = :alley")
    , @NamedQuery(name = "OpsNoticeInformer.findByRoad", query = "SELECT o FROM OpsNoticeInformer o WHERE o.road = :road")
    , @NamedQuery(name = "OpsNoticeInformer.findBySubDistrictCode", query = "SELECT o FROM OpsNoticeInformer o WHERE o.subDistrictCode = :subDistrictCode")
    , @NamedQuery(name = "OpsNoticeInformer.findBySubDistrict", query = "SELECT o FROM OpsNoticeInformer o WHERE o.subDistrict = :subDistrict")
    , @NamedQuery(name = "OpsNoticeInformer.findByDistrictCode", query = "SELECT o FROM OpsNoticeInformer o WHERE o.districtCode = :districtCode")
    , @NamedQuery(name = "OpsNoticeInformer.findByDistrict", query = "SELECT o FROM OpsNoticeInformer o WHERE o.district = :district")
    , @NamedQuery(name = "OpsNoticeInformer.findByProvinceCode", query = "SELECT o FROM OpsNoticeInformer o WHERE o.provinceCode = :provinceCode")
    , @NamedQuery(name = "OpsNoticeInformer.findByProvince", query = "SELECT o FROM OpsNoticeInformer o WHERE o.province = :province")
    , @NamedQuery(name = "OpsNoticeInformer.findByZipCode", query = "SELECT o FROM OpsNoticeInformer o WHERE o.zipCode = :zipCode")
    , @NamedQuery(name = "OpsNoticeInformer.findByTelephoneNo", query = "SELECT o FROM OpsNoticeInformer o WHERE o.telephoneNo = :telephoneNo")
    , @NamedQuery(name = "OpsNoticeInformer.findByInformerInfo", query = "SELECT o FROM OpsNoticeInformer o WHERE o.informerInfo = :informerInfo")
    , @NamedQuery(name = "OpsNoticeInformer.findByIsActive", query = "SELECT o FROM OpsNoticeInformer o WHERE o.isActive = :isActive")})
@SequenceGenerator(name = "noticeInformerID_Sequence", schema = "ILLEGAL60", sequenceName = "\"ops_notice_informer_SEQ\"", initialValue = 1, allocationSize = 1)
public class OpsNoticeInformer implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name ="\"InformerID\"")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="noticeInformerID_Sequence")
    private BigDecimal informerID;
    @Basic(optional = false)
    @Column(name ="\"InformerType\"")
    private BigInteger informerType;
    @Column(name ="\"TitleCode\"")
    private String titleCode;
    @Column(name ="\"TitleName\"")
    private String titleName;
    @Basic(optional = false)
    @Column(name ="\"FirstName\"")
    private String firstName;
    @Column(name ="\"LastName\"")
    private String lastName;
    @Column(name ="\"IDCard\"")
    private String iDCard;
    @Column(name ="\"Age\"")
    private Short age;
    @Column(name ="\"GenderType\"")
    private Character genderType;
    @Column(name ="\"Location\"")
    private String location;
    @Column(name ="\"Address\"")
    private String address;
    @Column(name ="\"Village\"")
    private String village;
    @Column(name ="\"Building\"")
    private String building;
    @Column(name ="\"Floor\"")
    private String floor;
    @Column(name ="\"Room\"")
    private String room;
    @Column(name ="\"Alley\"")
    private String alley;
    @Column(name ="\"Road\"")
    private String road;
    @Column(name ="\"SubDistrictCode\"")
    private String subDistrictCode;
    @Column(name ="\"SubDistrict\"")
    private String subDistrict;
    @Column(name ="\"DistrictCode\"")
    private String districtCode;
    @Column(name ="\"District\"")
    private String district;
    @Column(name ="\"ProvinceCode\"")
    private String provinceCode;
    @Column(name ="\"Province\"")
    private String province;
    @Column(name ="\"ZipCode\"")
    private String zipCode;
    @Column(name ="\"TelephoneNo\"")
    private String telephoneNo;
    @Column(name ="\"InformerInfo\"")
    private String informerInfo;
    @Column(name ="\"IsActive\"")
    private Short isActive;
//    
//    @JoinColumn(name ="\"NoticeCode", referencedColumnName ="\"NoticeCode\"")
//    @ManyToOne
    @Column(name ="\"NoticeCode\"")
    private String noticeCode;

    public OpsNoticeInformer() {
    }

    public OpsNoticeInformer(BigDecimal informerID) {
        this.informerID = informerID;
    }

    public OpsNoticeInformer(BigDecimal informerID, BigInteger informerType, String firstName) {
        this.informerID = informerID;
        this.informerType = informerType;
        this.firstName = firstName;
    }

    public BigDecimal getInformerID() {
        return informerID;
    }

    public void setInformerID(BigDecimal informerID) {
        this.informerID = informerID;
    }

    public BigInteger getInformerType() {
        return informerType;
    }

    public void setInformerType(BigInteger informerType) {
        this.informerType = informerType;
    }

    public String getTitleCode() {
        return titleCode;
    }

    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode;
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

    public String getIDCard() {
        return iDCard;
    }

    public void setIDCard(String iDCard) {
        this.iDCard = iDCard;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public Character getGenderType() {
        return genderType;
    }

    public void setGenderType(Character genderType) {
        this.genderType = genderType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getAlley() {
        return alley;
    }

    public void setAlley(String alley) {
        this.alley = alley;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getSubDistrictCode() {
        return subDistrictCode;
    }

    public void setSubDistrictCode(String subDistrictCode) {
        this.subDistrictCode = subDistrictCode;
    }

    public String getSubDistrict() {
        return subDistrict;
    }

    public void setSubDistrict(String subDistrict) {
        this.subDistrict = subDistrict;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public String getInformerInfo() {
        return informerInfo;
    }

    public void setInformerInfo(String informerInfo) {
        this.informerInfo = informerInfo;
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
        hash += (informerID != null ? informerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsNoticeInformer)) {
            return false;
        }
        OpsNoticeInformer other = (OpsNoticeInformer) object;
        if ((this.informerID == null && other.informerID != null) || (this.informerID != null && !this.informerID.equals(other.informerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsNoticeInformer[ informerID=" + informerID + " ]";
    }
    
}
