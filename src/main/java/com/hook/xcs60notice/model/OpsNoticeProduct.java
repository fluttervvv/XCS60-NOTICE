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
 * @author Pratin
 */
@Entity
@Table(name = "\"ops_notice_product\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "OpsNoticeProduct.findAll", query = "SELECT o FROM OpsNoticeProduct o")
    , @NamedQuery(name = "OpsNoticeProduct.findByProductID", query = "SELECT o FROM OpsNoticeProduct o WHERE o.productID = :productID")
    , @NamedQuery(name = "OpsNoticeProduct.findByGroupCode", query = "SELECT o FROM OpsNoticeProduct o WHERE o.groupCode = :groupCode")
    , @NamedQuery(name = "OpsNoticeProduct.findByIsDomestic", query = "SELECT o FROM OpsNoticeProduct o WHERE o.isDomestic = :isDomestic")
    , @NamedQuery(name = "OpsNoticeProduct.findByProductCode", query = "SELECT o FROM OpsNoticeProduct o WHERE o.productCode = :productCode")
    , @NamedQuery(name = "OpsNoticeProduct.findByBrandCode", query = "SELECT o FROM OpsNoticeProduct o WHERE o.brandCode = :brandCode")
    , @NamedQuery(name = "OpsNoticeProduct.findByBrandNameTH", query = "SELECT o FROM OpsNoticeProduct o WHERE o.brandNameTH = :brandNameTH")
    , @NamedQuery(name = "OpsNoticeProduct.findByBrandNameEN", query = "SELECT o FROM OpsNoticeProduct o WHERE o.brandNameEN = :brandNameEN")
    , @NamedQuery(name = "OpsNoticeProduct.findBySubBrandCode", query = "SELECT o FROM OpsNoticeProduct o WHERE o.subBrandCode = :subBrandCode")
    , @NamedQuery(name = "OpsNoticeProduct.findBySubBrandNameTH", query = "SELECT o FROM OpsNoticeProduct o WHERE o.subBrandNameTH = :subBrandNameTH")
    , @NamedQuery(name = "OpsNoticeProduct.findBySubBrandNameEN", query = "SELECT o FROM OpsNoticeProduct o WHERE o.subBrandNameEN = :subBrandNameEN")
    , @NamedQuery(name = "OpsNoticeProduct.findByModelCode", query = "SELECT o FROM OpsNoticeProduct o WHERE o.modelCode = :modelCode")
    , @NamedQuery(name = "OpsNoticeProduct.findByModelName", query = "SELECT o FROM OpsNoticeProduct o WHERE o.modelName = :modelName")
    , @NamedQuery(name = "OpsNoticeProduct.findByFixNo1", query = "SELECT o FROM OpsNoticeProduct o WHERE o.fixNo1 = :fixNo1")
    , @NamedQuery(name = "OpsNoticeProduct.findByDegreeCode", query = "SELECT o FROM OpsNoticeProduct o WHERE o.degreeCode = :degreeCode")
    , @NamedQuery(name = "OpsNoticeProduct.findByDegree", query = "SELECT o FROM OpsNoticeProduct o WHERE o.degree = :degree")
    , @NamedQuery(name = "OpsNoticeProduct.findBySizeCode", query = "SELECT o FROM OpsNoticeProduct o WHERE o.sizeCode = :sizeCode")
    , @NamedQuery(name = "OpsNoticeProduct.findBySize", query = "SELECT o FROM OpsNoticeProduct o WHERE o.size = :size")
    , @NamedQuery(name = "OpsNoticeProduct.findBySizeUnitCode", query = "SELECT o FROM OpsNoticeProduct o WHERE o.sizeUnitCode = :sizeUnitCode")
    , @NamedQuery(name = "OpsNoticeProduct.findBySizeUnitName", query = "SELECT o FROM OpsNoticeProduct o WHERE o.sizeUnitName = :sizeUnitName")
    , @NamedQuery(name = "OpsNoticeProduct.findByFixNo2", query = "SELECT o FROM OpsNoticeProduct o WHERE o.fixNo2 = :fixNo2")
    , @NamedQuery(name = "OpsNoticeProduct.findBySequenceNo", query = "SELECT o FROM OpsNoticeProduct o WHERE o.sequenceNo = :sequenceNo")
    , @NamedQuery(name = "OpsNoticeProduct.findByProductDesc", query = "SELECT o FROM OpsNoticeProduct o WHERE o.productDesc = :productDesc")
    , @NamedQuery(name = "OpsNoticeProduct.findByCarNo", query = "SELECT o FROM OpsNoticeProduct o WHERE o.carNo = :carNo")
    , @NamedQuery(name = "OpsNoticeProduct.findByQty", query = "SELECT o FROM OpsNoticeProduct o WHERE o.qty = :qty")
    , @NamedQuery(name = "OpsNoticeProduct.findByQtyUnit", query = "SELECT o FROM OpsNoticeProduct o WHERE o.qtyUnit = :qtyUnit")
    , @NamedQuery(name = "OpsNoticeProduct.findByNetVolume", query = "SELECT o FROM OpsNoticeProduct o WHERE o.netVolume = :netVolume")
    , @NamedQuery(name = "OpsNoticeProduct.findByNetVolumeUnit", query = "SELECT o FROM OpsNoticeProduct o WHERE o.netVolumeUnit = :netVolumeUnit")
    , @NamedQuery(name = "OpsNoticeProduct.findByRemarks", query = "SELECT o FROM OpsNoticeProduct o WHERE o.remarks = :remarks")
    , @NamedQuery(name = "OpsNoticeProduct.findByIsActive", query = "SELECT o FROM OpsNoticeProduct o WHERE o.isActive = :isActive")})
@SequenceGenerator(name = "noticeProductID_Sequence", schema = "ILLEGAL60", sequenceName = "\"ops_notice_product_SEQ\"", initialValue = 1, allocationSize = 1)
public class OpsNoticeProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name ="\"ProductID\"")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="noticeProductID_Sequence")
    private Long productID;
    @Basic(optional = false)
    @Column(name ="\"GroupCode\"")
    private String groupCode;
    @Column(name ="\"IsDomestic\"")
    private Short isDomestic;
    @Column(name ="\"ProductCode\"")
    private String productCode;
    @Column(name ="\"BrandCode\"")
    private String brandCode;
    @Column(name ="\"BrandNameTH\"")
    private String brandNameTH;
    @Column(name ="\"BrandNameEN\"")
    private String brandNameEN;
    @Column(name ="\"SubBrandCode\"")
    private String subBrandCode;
    @Column(name ="\"SubBrandNameTH\"")
    private String subBrandNameTH;
    @Column(name ="\"SubBrandNameEN\"")
    private String subBrandNameEN;
    @Column(name ="\"ModelCode\"")
    private String modelCode;
    @Column(name ="\"ModelName\"")
    private String modelName;
    @Column(name ="\"FixNo1\"")
    private Short fixNo1;
    @Column(name ="\"DegreeCode\"")
    private String degreeCode;
    @Column(name ="\"Degree\"")
    private Short degree;
    @Column(name ="\"SizeCode\"")
    private String sizeCode;
    @Column(name ="\"Size\"")
    private String size;
    @Column(name ="\"SizeUnitCode\"")
    private String sizeUnitCode;
    @Column(name ="\"SizeUnitName\"")
    private String sizeUnitName;
    @Column(name ="\"FixNo2\"")
    private Short fixNo2;
    @Column(name ="\"SequenceNo\"")
    private String sequenceNo;
    @Column(name ="\"ProductDesc\"")
    private String productDesc;
    @Column(name ="\"CarNo\"")
    private String carNo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name ="\"Qty\"")
    private Double qty;
    @Column(name ="\"QtyUnit\"")
    private Double qtyUnit;
    @Column(name ="\"NetVolume\"")
    private Double netVolume;
    @Column(name ="\"NetVolumeUnit\"")
    private Double netVolumeUnit;
    @Column(name ="\"Remarks\"")
    private String remarks;
    @Basic(optional = false)
    @Column(name ="\"IsActive\"")
    private short isActive;
    
//    @JoinColumn(name ="\"NoticeCode", referencedColumnName ="\"NoticeCode\"")
//    @ManyToOne
    @Column(name ="\"NoticeCode\"")
    private String noticeCode;

    public OpsNoticeProduct() {
    }

    public OpsNoticeProduct(Long productID) {
        this.productID = productID;
    }

    public OpsNoticeProduct(Long productID, String groupCode, short isActive) {
        this.productID = productID;
        this.groupCode = groupCode;
        this.isActive = isActive;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }
    
    public void setProductID(String productID) {
        this.productID = Long.valueOf(productID);
    }


    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public Short getIsDomestic() {
        return isDomestic;
    }

    public void setIsDomestic(Short isDomestic) {
        this.isDomestic = isDomestic;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandNameTH() {
        return brandNameTH;
    }

    public void setBrandNameTH(String brandNameTH) {
        this.brandNameTH = brandNameTH;
    }

    public String getBrandNameEN() {
        return brandNameEN;
    }

    public void setBrandNameEN(String brandNameEN) {
        this.brandNameEN = brandNameEN;
    }

    public String getSubBrandCode() {
        return subBrandCode;
    }

    public void setSubBrandCode(String subBrandCode) {
        this.subBrandCode = subBrandCode;
    }

    public String getSubBrandNameTH() {
        return subBrandNameTH;
    }

    public void setSubBrandNameTH(String subBrandNameTH) {
        this.subBrandNameTH = subBrandNameTH;
    }

    public String getSubBrandNameEN() {
        return subBrandNameEN;
    }

    public void setSubBrandNameEN(String subBrandNameEN) {
        this.subBrandNameEN = subBrandNameEN;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Short getFixNo1() {
        return fixNo1;
    }

    public void setFixNo1(Short fixNo1) {
        this.fixNo1 = fixNo1;
    }

    public String getDegreeCode() {
        return degreeCode;
    }

    public void setDegreeCode(String degreeCode) {
        this.degreeCode = degreeCode;
    }

    public Short getDegree() {
        return degree;
    }

    public void setDegree(Short degree) {
        this.degree = degree;
    }

    public String getSizeCode() {
        return sizeCode;
    }

    public void setSizeCode(String sizeCode) {
        this.sizeCode = sizeCode;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSizeUnitCode() {
        return sizeUnitCode;
    }

    public void setSizeUnitCode(String sizeUnitCode) {
        this.sizeUnitCode = sizeUnitCode;
    }

    public String getSizeUnitName() {
        return sizeUnitName;
    }

    public void setSizeUnitName(String sizeUnitName) {
        this.sizeUnitName = sizeUnitName;
    }

    public Short getFixNo2() {
        return fixNo2;
    }

    public void setFixNo2(Short fixNo2) {
        this.fixNo2 = fixNo2;
    }

    public String getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getQtyUnit() {
        return qtyUnit;
    }

    public void setQtyUnit(Double qtyUnit) {
        this.qtyUnit = qtyUnit;
    }

    public Double getNetVolume() {
        return netVolume;
    }

    public void setNetVolume(Double netVolume) {
        this.netVolume = netVolume;
    }

    public Double getNetVolumeUnit() {
        return netVolumeUnit;
    }

    public void setNetVolumeUnit(Double netVolumeUnit) {
        this.netVolumeUnit = netVolumeUnit;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        hash += (productID != null ? productID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsNoticeProduct)) {
            return false;
        }
        OpsNoticeProduct other = (OpsNoticeProduct) object;
        if ((this.productID == null && other.productID != null) || (this.productID != null && !this.productID.equals(other.productID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsNoticeProduct[ productID=" + productID + " ]";
    }
    
}
