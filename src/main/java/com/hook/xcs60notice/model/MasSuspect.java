/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60notice.model;

import java.io.Serializable;
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

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"mas_suspect\"", catalog = "", schema = "ILLEGAL60")
@NamedQueries({
    @NamedQuery(name = "MasSuspect.findAll", query = "SELECT m FROM MasSuspect m")
    , @NamedQuery(name = "MasSuspect.findBySuspectID", query = "SELECT m FROM MasSuspect m WHERE m.suspectID = :suspectID")
    , @NamedQuery(name = "MasSuspect.findByEntityType", query = "SELECT m FROM MasSuspect m WHERE m.entityType = :entityType")
    , @NamedQuery(name = "MasSuspect.findByCompanyTitleCode", query = "SELECT m FROM MasSuspect m WHERE m.companyTitleCode = :companyTitleCode")
    , @NamedQuery(name = "MasSuspect.findByCompanyTitle", query = "SELECT m FROM MasSuspect m WHERE m.companyTitle = :companyTitle")
    , @NamedQuery(name = "MasSuspect.findByCompanyName", query = "SELECT m FROM MasSuspect m WHERE m.companyName = :companyName")
    , @NamedQuery(name = "MasSuspect.findByCompanyOtherName", query = "SELECT m FROM MasSuspect m WHERE m.companyOtherName = :companyOtherName")
    , @NamedQuery(name = "MasSuspect.findByCompanyRegistrationNo", query = "SELECT m FROM MasSuspect m WHERE m.companyRegistrationNo = :companyRegistrationNo")
    , @NamedQuery(name = "MasSuspect.findByCompanyLicenseNo", query = "SELECT m FROM MasSuspect m WHERE m.companyLicenseNo = :companyLicenseNo")
    , @NamedQuery(name = "MasSuspect.findByFoundedDate", query = "SELECT m FROM MasSuspect m WHERE m.foundedDate = :foundedDate")
    , @NamedQuery(name = "MasSuspect.findByLicenseDateForm", query = "SELECT m FROM MasSuspect m WHERE m.licenseDateForm = :licenseDateForm")
    , @NamedQuery(name = "MasSuspect.findByLicenseDateTo", query = "SELECT m FROM MasSuspect m WHERE m.licenseDateTo = :licenseDateTo")
    , @NamedQuery(name = "MasSuspect.findByTaxID", query = "SELECT m FROM MasSuspect m WHERE m.taxID = :taxID")
    , @NamedQuery(name = "MasSuspect.findByExciseRegNo", query = "SELECT m FROM MasSuspect m WHERE m.exciseRegNo = :exciseRegNo")
    , @NamedQuery(name = "MasSuspect.findBySuspectType", query = "SELECT m FROM MasSuspect m WHERE m.suspectType = :suspectType")
    , @NamedQuery(name = "MasSuspect.findBySuspectTitleCode", query = "SELECT m FROM MasSuspect m WHERE m.suspectTitleCode = :suspectTitleCode")
    , @NamedQuery(name = "MasSuspect.findBySuspectTitleName", query = "SELECT m FROM MasSuspect m WHERE m.suspectTitleName = :suspectTitleName")
    , @NamedQuery(name = "MasSuspect.findBySuspectFirstName", query = "SELECT m FROM MasSuspect m WHERE m.suspectFirstName = :suspectFirstName")
    , @NamedQuery(name = "MasSuspect.findBySuspectMiddleName", query = "SELECT m FROM MasSuspect m WHERE m.suspectMiddleName = :suspectMiddleName")
    , @NamedQuery(name = "MasSuspect.findBySuspectLastName", query = "SELECT m FROM MasSuspect m WHERE m.suspectLastName = :suspectLastName")
    , @NamedQuery(name = "MasSuspect.findBySuspectOtherName", query = "SELECT m FROM MasSuspect m WHERE m.suspectOtherName = :suspectOtherName")
    , @NamedQuery(name = "MasSuspect.findBySuspectDesc", query = "SELECT m FROM MasSuspect m WHERE m.suspectDesc = :suspectDesc")
    , @NamedQuery(name = "MasSuspect.findByIDCard", query = "SELECT m FROM MasSuspect m WHERE m.iDCard = :iDCard")
    , @NamedQuery(name = "MasSuspect.findByPassportNo", query = "SELECT m FROM MasSuspect m WHERE m.passportNo = :passportNo")
    , @NamedQuery(name = "MasSuspect.findByVISAType", query = "SELECT m FROM MasSuspect m WHERE m.vISAType = :vISAType")
    , @NamedQuery(name = "MasSuspect.findByPassportCountryCode", query = "SELECT m FROM MasSuspect m WHERE m.passportCountryCode = :passportCountryCode")
    , @NamedQuery(name = "MasSuspect.findByPassportCountryName", query = "SELECT m FROM MasSuspect m WHERE m.passportCountryName = :passportCountryName")
    , @NamedQuery(name = "MasSuspect.findByPassportDateIn", query = "SELECT m FROM MasSuspect m WHERE m.passportDateIn = :passportDateIn")
    , @NamedQuery(name = "MasSuspect.findByPassportDateOut", query = "SELECT m FROM MasSuspect m WHERE m.passportDateOut = :passportDateOut")
    , @NamedQuery(name = "MasSuspect.findByBirthDate", query = "SELECT m FROM MasSuspect m WHERE m.birthDate = :birthDate")
    , @NamedQuery(name = "MasSuspect.findByGenderType", query = "SELECT m FROM MasSuspect m WHERE m.genderType = :genderType")
    , @NamedQuery(name = "MasSuspect.findByBloodType", query = "SELECT m FROM MasSuspect m WHERE m.bloodType = :bloodType")
    , @NamedQuery(name = "MasSuspect.findByNationalityNameTH", query = "SELECT m FROM MasSuspect m WHERE m.nationalityNameTH = :nationalityNameTH")
    , @NamedQuery(name = "MasSuspect.findByRaceCode", query = "SELECT m FROM MasSuspect m WHERE m.raceCode = :raceCode")
    , @NamedQuery(name = "MasSuspect.findByRaceName", query = "SELECT m FROM MasSuspect m WHERE m.raceName = :raceName")
    , @NamedQuery(name = "MasSuspect.findByReligionCode", query = "SELECT m FROM MasSuspect m WHERE m.religionCode = :religionCode")
    , @NamedQuery(name = "MasSuspect.findByReligionName", query = "SELECT m FROM MasSuspect m WHERE m.religionName = :religionName")
    , @NamedQuery(name = "MasSuspect.findByMaritalStatus", query = "SELECT m FROM MasSuspect m WHERE m.maritalStatus = :maritalStatus")
    , @NamedQuery(name = "MasSuspect.findByCareer", query = "SELECT m FROM MasSuspect m WHERE m.career = :career")
    , @NamedQuery(name = "MasSuspect.findByGps", query = "SELECT m FROM MasSuspect m WHERE m.gps = :gps")
    , @NamedQuery(name = "MasSuspect.findByLocation", query = "SELECT m FROM MasSuspect m WHERE m.location = :location")
    , @NamedQuery(name = "MasSuspect.findByAddress", query = "SELECT m FROM MasSuspect m WHERE m.address = :address")
    , @NamedQuery(name = "MasSuspect.findByVillage", query = "SELECT m FROM MasSuspect m WHERE m.village = :village")
    , @NamedQuery(name = "MasSuspect.findByBuilding", query = "SELECT m FROM MasSuspect m WHERE m.building = :building")
    , @NamedQuery(name = "MasSuspect.findByFloor", query = "SELECT m FROM MasSuspect m WHERE m.floor = :floor")
    , @NamedQuery(name = "MasSuspect.findByRoom", query = "SELECT m FROM MasSuspect m WHERE m.room = :room")
    , @NamedQuery(name = "MasSuspect.findByAlley", query = "SELECT m FROM MasSuspect m WHERE m.alley = :alley")
    , @NamedQuery(name = "MasSuspect.findByRoad", query = "SELECT m FROM MasSuspect m WHERE m.road = :road")
    , @NamedQuery(name = "MasSuspect.findBySubDistrictCode", query = "SELECT m FROM MasSuspect m WHERE m.subDistrictCode = :subDistrictCode")
    , @NamedQuery(name = "MasSuspect.findBySubDistrict", query = "SELECT m FROM MasSuspect m WHERE m.subDistrict = :subDistrict")
    , @NamedQuery(name = "MasSuspect.findByDistrictCode", query = "SELECT m FROM MasSuspect m WHERE m.districtCode = :districtCode")
    , @NamedQuery(name = "MasSuspect.findByDistrict", query = "SELECT m FROM MasSuspect m WHERE m.district = :district")
    , @NamedQuery(name = "MasSuspect.findByProvinceCode", query = "SELECT m FROM MasSuspect m WHERE m.provinceCode = :provinceCode")
    , @NamedQuery(name = "MasSuspect.findByProvince", query = "SELECT m FROM MasSuspect m WHERE m.province = :province")
    , @NamedQuery(name = "MasSuspect.findByZipCode", query = "SELECT m FROM MasSuspect m WHERE m.zipCode = :zipCode")
    , @NamedQuery(name = "MasSuspect.findByTelephoneNo", query = "SELECT m FROM MasSuspect m WHERE m.telephoneNo = :telephoneNo")
    , @NamedQuery(name = "MasSuspect.findByEmail", query = "SELECT m FROM MasSuspect m WHERE m.email = :email")
    , @NamedQuery(name = "MasSuspect.findByFatherName", query = "SELECT m FROM MasSuspect m WHERE m.fatherName = :fatherName")
    , @NamedQuery(name = "MasSuspect.findByMotherName", query = "SELECT m FROM MasSuspect m WHERE m.motherName = :motherName")
    , @NamedQuery(name = "MasSuspect.findByRemarks", query = "SELECT m FROM MasSuspect m WHERE m.remarks = :remarks")
    , @NamedQuery(name = "MasSuspect.findByLinkPhoto", query = "SELECT m FROM MasSuspect m WHERE m.linkPhoto = :linkPhoto")
    , @NamedQuery(name = "MasSuspect.findByPhotoDesc", query = "SELECT m FROM MasSuspect m WHERE m.photoDesc = :photoDesc")
    , @NamedQuery(name = "MasSuspect.findByIsActive", query = "SELECT m FROM MasSuspect m WHERE m.isActive = :isActive")})
public class MasSuspect implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name ="\"SuspectID\"")
    private Short suspectID;
    @Basic(optional = false)
    @Column(name ="\"EntityType\"")
    private short entityType;
    @Column(name ="\"CompanyTitleCode\"")
    private String companyTitleCode;
    @Column(name ="\"CompanyTitle\"")
    private String companyTitle;
    @Column(name ="\"CompanyName\"")
    private String companyName;
    @Column(name ="\"CompanyOtherName\"")
    private String companyOtherName;
    @Column(name ="\"CompanyRegistrationNo\"")
    private String companyRegistrationNo;
    @Column(name ="\"CompanyLicenseNo\"")
    private String companyLicenseNo;
    @Column(name ="\"FoundedDate\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date foundedDate;
    @Column(name ="\"LicenseDateForm\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date licenseDateForm;
    @Column(name ="\"LicenseDateTo\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date licenseDateTo;
    @Column(name ="\"TaxID\"")
    private String taxID;
    @Column(name ="\"ExciseRegNo\"")
    private String exciseRegNo;
    @Basic(optional = false)
    @Column(name ="\"SuspectType\"")
    private short suspectType;
    @Column(name ="\"SuspectTitleCode\"")
    private String suspectTitleCode;
    @Column(name ="\"SuspectTitleName\"")
    private String suspectTitleName;
    @Basic(optional = false)
    @Column(name ="\"SuspectFirstName\"")
    private String suspectFirstName;
    @Column(name ="\"SuspectMiddleName\"")
    private String suspectMiddleName;
    @Basic(optional = false)
    @Column(name ="\"SuspectLastName\"")
    private String suspectLastName;
    @Column(name ="\"SuspectOtherName\"")
    private String suspectOtherName;
    @Column(name ="\"SuspectDesc\"")
    private String suspectDesc;
    @Basic(optional = false)
    @Column(name ="\"IDCard\"")
    private String iDCard;
    @Column(name ="\"PassportNo\"")
    private String passportNo;
    @Column(name ="\"VISAType\"")
    private Short vISAType;
    @Column(name ="\"PassportCountryCode\"")
    private String passportCountryCode;
    @Column(name ="\"PassportCountryName\"")
    private String passportCountryName;
    @Column(name ="\"PassportDateIn\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date passportDateIn;
    @Column(name ="\"PassportDateOut\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date passportDateOut;
    @Column(name ="\"BirthDate\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;
    @Basic(optional = false)
    @Column(name ="\"GenderType\"")
    private Character genderType;
    @Column(name ="\"BloodType\"")
    private String bloodType;
    @Column(name ="\"NationalityNameTH\"")
    private String nationalityNameTH;
    @Column(name ="\"RaceCode\"")
    private String raceCode;
    @Column(name ="\"RaceName\"")
    private String raceName;
    @Column(name ="\"ReligionCode\"")
    private String religionCode;
    @Column(name ="\"ReligionName\"")
    private String religionName;
    @Column(name ="\"MaritalStatus\"")
    private String maritalStatus;
    @Column(name ="\"Career\"")
    private String career;
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
    @Column(name ="\"Email\"")
    private String email;
    @Column(name ="\"FatherName\"")
    private String fatherName;
    @Column(name ="\"MotherName\"")
    private String motherName;
    @Column(name ="\"Remarks\"")
    private String remarks;
    @Column(name ="\"LinkPhoto\"")
    private String linkPhoto;
    @Column(name ="\"PhotoDesc\"")
    private String photoDesc;
    @Basic(optional = false)
    @Column(name ="\"IsActive\"")
    private short isActive;
    
//    @JoinColumn(name ="\"NationalityCode", referencedColumnName ="\"NationalityCode\"")
//    @ManyToOne
    
    @Column(name ="\"NationalityCode\"")
    private String nationalityCode;
    
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "suspectReferenceID")
//    private Collection<OpsInvestigateDetailSuspect> opsInvestigateDetailSuspectCollection;

    public MasSuspect() {
    }

    public MasSuspect(Short suspectID) {
        this.suspectID = suspectID;
    }

    public MasSuspect(Short suspectID, short entityType, short suspectType, String suspectFirstName, String suspectLastName, String iDCard, Character genderType, short isActive) {
        this.suspectID = suspectID;
        this.entityType = entityType;
        this.suspectType = suspectType;
        this.suspectFirstName = suspectFirstName;
        this.suspectLastName = suspectLastName;
        this.iDCard = iDCard;
        this.genderType = genderType;
        this.isActive = isActive;
    }

    public Short getSuspectID() {
        return suspectID;
    }

    public void setSuspectID(Short suspectID) {
        this.suspectID = suspectID;
    }

    public short getEntityType() {
        return entityType;
    }

    public void setEntityType(short entityType) {
        this.entityType = entityType;
    }

    public String getCompanyTitleCode() {
        return companyTitleCode;
    }

    public void setCompanyTitleCode(String companyTitleCode) {
        this.companyTitleCode = companyTitleCode;
    }

    public String getCompanyTitle() {
        return companyTitle;
    }

    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
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

    public String getCompanyRegistrationNo() {
        return companyRegistrationNo;
    }

    public void setCompanyRegistrationNo(String companyRegistrationNo) {
        this.companyRegistrationNo = companyRegistrationNo;
    }

    public String getCompanyLicenseNo() {
        return companyLicenseNo;
    }

    public void setCompanyLicenseNo(String companyLicenseNo) {
        this.companyLicenseNo = companyLicenseNo;
    }

    public Date getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(Date foundedDate) {
        this.foundedDate = foundedDate;
    }

    public Date getLicenseDateForm() {
        return licenseDateForm;
    }

    public void setLicenseDateForm(Date licenseDateForm) {
        this.licenseDateForm = licenseDateForm;
    }

    public Date getLicenseDateTo() {
        return licenseDateTo;
    }

    public void setLicenseDateTo(Date licenseDateTo) {
        this.licenseDateTo = licenseDateTo;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public String getExciseRegNo() {
        return exciseRegNo;
    }

    public void setExciseRegNo(String exciseRegNo) {
        this.exciseRegNo = exciseRegNo;
    }

    public short getSuspectType() {
        return suspectType;
    }

    public void setSuspectType(short suspectType) {
        this.suspectType = suspectType;
    }

    public String getSuspectTitleCode() {
        return suspectTitleCode;
    }

    public void setSuspectTitleCode(String suspectTitleCode) {
        this.suspectTitleCode = suspectTitleCode;
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

    public String getSuspectMiddleName() {
        return suspectMiddleName;
    }

    public void setSuspectMiddleName(String suspectMiddleName) {
        this.suspectMiddleName = suspectMiddleName;
    }

    public String getSuspectLastName() {
        return suspectLastName;
    }

    public void setSuspectLastName(String suspectLastName) {
        this.suspectLastName = suspectLastName;
    }

    public String getSuspectOtherName() {
        return suspectOtherName;
    }

    public void setSuspectOtherName(String suspectOtherName) {
        this.suspectOtherName = suspectOtherName;
    }

    public String getSuspectDesc() {
        return suspectDesc;
    }

    public void setSuspectDesc(String suspectDesc) {
        this.suspectDesc = suspectDesc;
    }

    public String getIDCard() {
        return iDCard;
    }

    public void setIDCard(String iDCard) {
        this.iDCard = iDCard;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public Short getVISAType() {
        return vISAType;
    }

    public void setVISAType(Short vISAType) {
        this.vISAType = vISAType;
    }

    public String getPassportCountryCode() {
        return passportCountryCode;
    }

    public void setPassportCountryCode(String passportCountryCode) {
        this.passportCountryCode = passportCountryCode;
    }

    public String getPassportCountryName() {
        return passportCountryName;
    }

    public void setPassportCountryName(String passportCountryName) {
        this.passportCountryName = passportCountryName;
    }

    public Date getPassportDateIn() {
        return passportDateIn;
    }

    public void setPassportDateIn(Date passportDateIn) {
        this.passportDateIn = passportDateIn;
    }

    public Date getPassportDateOut() {
        return passportDateOut;
    }

    public void setPassportDateOut(Date passportDateOut) {
        this.passportDateOut = passportDateOut;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Character getGenderType() {
        return genderType;
    }

    public void setGenderType(Character genderType) {
        this.genderType = genderType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getNationalityNameTH() {
        return nationalityNameTH;
    }

    public void setNationalityNameTH(String nationalityNameTH) {
        this.nationalityNameTH = nationalityNameTH;
    }

    public String getRaceCode() {
        return raceCode;
    }

    public void setRaceCode(String raceCode) {
        this.raceCode = raceCode;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getReligionCode() {
        return religionCode;
    }

    public void setReligionCode(String religionCode) {
        this.religionCode = religionCode;
    }

    public String getReligionName() {
        return religionName;
    }

    public void setReligionName(String religionName) {
        this.religionName = religionName;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLinkPhoto() {
        return linkPhoto;
    }

    public void setLinkPhoto(String linkPhoto) {
        this.linkPhoto = linkPhoto;
    }

    public String getPhotoDesc() {
        return photoDesc;
    }

    public void setPhotoDesc(String photoDesc) {
        this.photoDesc = photoDesc;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

//    @XmlTransient
//    public Collection<OpsInvestigateDetailSuspect> getOpsInvestigateDetailSuspectCollection() {
//        return opsInvestigateDetailSuspectCollection;
//    }
//
//    public void setOpsInvestigateDetailSuspectCollection(Collection<OpsInvestigateDetailSuspect> opsInvestigateDetailSuspectCollection) {
//        this.opsInvestigateDetailSuspectCollection = opsInvestigateDetailSuspectCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (suspectID != null ? suspectID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasSuspect)) {
            return false;
        }
        MasSuspect other = (MasSuspect) object;
        if ((this.suspectID == null && other.suspectID != null) || (this.suspectID != null && !this.suspectID.equals(other.suspectID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.MasSuspect[ suspectID=" + suspectID + " ]";
    }
    
}
