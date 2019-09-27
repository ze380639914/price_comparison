package com.zewu.price.comparison.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class BrickOrGoods implements Serializable {
    @ApiModelProperty(value = "ID")
    private String id;

    @ApiModelProperty(value = "序号")
    private String serialNumber;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "规格")
    private String specification;

    @ApiModelProperty(value = "一级单位")
    private String unitName;

    @ApiModelProperty(value = "二级单位")
    private String unitNameSecond;

    @ApiModelProperty(value = "售价")
    private String unitPrice;

    @ApiModelProperty(value = "进价")
    private String purchasePrice;

    @ApiModelProperty(value = "尺寸")
    private String size;

    @ApiModelProperty(value = "颜色")
    private String color;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitNameSecond() {
        return unitNameSecond;
    }

    public void setUnitNameSecond(String unitNameSecond) {
        this.unitNameSecond = unitNameSecond;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", name=").append(name);
        sb.append(", specification=").append(specification);
        sb.append(", unitName=").append(unitName);
        sb.append(", unitNameSecond=").append(unitNameSecond);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", purchasePrice=").append(purchasePrice);
        sb.append(", size=").append(size);
        sb.append(", color=").append(color);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}