package com.zewu.price.comparison.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TradingSheet implements Serializable {
    @ApiModelProperty(value = "ID")
    private String id;

    @ApiModelProperty(value = "买主")
    private String buyer;

    @ApiModelProperty(value = "创建时间")
    private Date creationTime;

    @ApiModelProperty(value = "交易类型(0、出货 1、退货)")
    private Integer type;

    @ApiModelProperty(value = "出货方式(0、送货 1、自提)")
    private Integer shippingMode;

    @ApiModelProperty(value = "状态(0、进行中 1、未结清 2、已结清)")
    private Integer status;

    @ApiModelProperty(value = "议定总价")
    private String totalPrice;

    @ApiModelProperty(value = "备注")
    private String bak;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getShippingMode() {
        return shippingMode;
    }

    public void setShippingMode(Integer shippingMode) {
        this.shippingMode = shippingMode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", buyer=").append(buyer);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", type=").append(type);
        sb.append(", shippingMode=").append(shippingMode);
        sb.append(", status=").append(status);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", bak=").append(bak);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}