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
 * @author Pratin ops_notice_locale_SEQ
 */
@Entity
@Table(name = "\"ops_notice_locale\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "OpsNoticeLocale.findAll", query = "SELECT o FROM OpsNoticeLocale o")
    , @NamedQuery(name = "OpsNoticeLocale.findByLocaleID", query = "SELECT o FROM OpsNoticeLocale o WHERE o.localeID = :localeID")
    , @NamedQuery(name = "OpsNoticeLocale.findByGps", query = "SELECT o FROM OpsNoticeLocale o WHERE o.gps = :gps")
    , @NamedQuery(name = "OpsNoticeLocale.findByLocation", query = "SELECT o FROM OpsNoticeLocale o WHERE o.location = :location")
    , @NamedQuery(name = "OpsNoticeLocale.findByAddress", query = "SELECT o FROM OpsNoticeLocale o WHERE o.address = :address")
    , @NamedQuery(name = "OpsNoticeLocale.findByVillage", query = "SELECT o FROM OpsNoticeLocale o WHERE o.village = :village")
    , @NamedQuery(name = "OpsNoticeLocale.findByBuilding", query = "SELECT o FROM OpsNoticeLocale o WHERE o.building = :building")
    , @NamedQuery(name = "OpsNoticeLocale.findByFloor", query = "SELECT o FROM OpsNoticeLocale o WHERE o.floor = :floor")
    , @NamedQuery(name = "OpsNoticeLocale.findByRoom", query = "SELECT o FROM OpsNoticeLocale o WHERE o.room = :room")
    , @NamedQuery(name = "OpsNoticeLocale.findByAlley", query = "SELECT o FROM OpsNoticeLocale o WHERE o.alley = :alley")
    , @NamedQuery(name = "OpsNoticeLocale.findByRoad", query = "SELECT o FROM OpsNoticeLocale o WHERE o.road = :road")
    , @NamedQuery(name = "OpsNoticeLocale.findBySubdistrictCode", query = "SELECT o FROM OpsNoticeLocale o WHERE o.subdistrictCode = :subdistrictCode")
    , @NamedQuery(name = "OpsNoticeLocale.findBySubDistrict", query = "SELECT o FROM OpsNoticeLocale o WHERE o.subDistrict = :subDistrict")
    , @NamedQuery(name = "OpsNoticeLocale.findByDistrictCode", query = "SELECT o FROM OpsNoticeLocale o WHERE o.districtCode = :districtCode")
    , @NamedQuery(name = "OpsNoticeLocale.findByDistrict", query = "SELECT o FROM OpsNoticeLocale o WHERE o.district = :district")
    , @NamedQuery(name = "OpsNoticeLocale.findByProvinceCode", query = "SELECT o FROM OpsNoticeLocale o WHERE o.provinceCode = :provinceCode")
    , @NamedQuery(name = "OpsNoticeLocale.findByProvince", query = "SELECT o FROM OpsNoticeLocale o WHERE o.province = :province")
    , @NamedQuery(name = "OpsNoticeLocale.findByZipCode", query = "SELECT o FROM OpsNoticeLocale o WHERE o.zipCode = :zipCode")
    , @NamedQuery(name = "OpsNoticeLocale.findByPolicestation", query = "SELECT o FROM OpsNoticeLocale o WHERE o.policestation = :policestation")
    , @NamedQuery(name = "OpsNoticeLocale.findByIsActive", query = "SELECT o FROM OpsNoticeLocale o WHERE o.isActive = :isActive")})
@SequenceGenerator(name = "noticeLocaleID_Sequence", schema = "ILLEGAL60", sequenceName = "\"ops_notice_locale_SEQ\"", initialValue = 1, allocationSize = 1)
public class OpsNoticeLocale implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="noticeLocaleID_Sequence")
    @Column(name ="\"LocaleID\"")
    private Long localeID;
    @Column(name ="\"GPS\"")
    private String gps;
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
    @Column(name ="\"SubdistrictCode\"")
    private String subdistrictCode;
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
    @Column(name ="\"Policestation\"")
    private String policestation;
    @Basic(optional = false)
    @Column(name ="\"IsActive\"")
    private short isActive;
    
//    @JoinColumn(name = "NoticeCode", referencedColumnName = "NoticeCode")
//    @ManyToOne
    @Column(name = "\"NoticeCode\"")
    private String noticeCode;

    public OpsNoticeLocale() {
    }

    public OpsNoticeLocale(Long localeID) {
        this.localeID = localeID;
    }

    public OpsNoticeLocale(Long localeID, short isActive) {
        this.localeID = localeID;
        this.isActive = isActive;
    }

    public Long getLocaleID() {
        return localeID;
    }

    public void setLocaleID(Long localeID) {
        this.localeID = localeID;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
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

    public String getSubdistrictCode() {
        return subdistrictCode;
    }

    public void setSubdistrictCode(String subdistrictCode) {
        this.subdistrictCode = subdistrictCode;
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

    public String getPolicestation() {
        return policestation;
    }

    public void setPolicestation(String policestation) {
        this.policestation = policestation;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
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
        hash += (localeID != null ? localeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsNoticeLocale)) {
            return false;
        }
        OpsNoticeLocale other = (OpsNoticeLocale) object;
        if ((this.localeID == null && other.localeID != null) || (this.localeID != null && !this.localeID.equals(other.localeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsNoticeLocale[ localeID=" + localeID + " ]";
    }
    
}
