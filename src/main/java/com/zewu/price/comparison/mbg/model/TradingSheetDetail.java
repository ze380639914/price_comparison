package com.zewu.price.comparison.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TradingSheetDetail implements Serializable {
    @ApiModelProperty(value = "ID")
    private String id;

    @ApiModelProperty(value = "交易单ID")
    private String tradingSheetId;

    @ApiModelProperty(value = "商品ID")
    private String brickOrGoodsId;

    @ApiModelProperty(value = "出货量")
    private String shipment;

    @ApiModelProperty(value = "议定售价")
    private String unitPrice;

    @ApiModelProperty(value = "议定总价")
    private String totalPrice;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTradingSheetId() {
        return tradingSheetId;
    }

    public void setTradingSheetId(String tradingSheetId) {
        this.tradingSheetId = tradingSheetId;
    }

    public String getBrickOrGoodsId() {
        return brickOrGoodsId;
    }

    public void setBrickOrGoodsId(String brickOrGoodsId) {
        this.brickOrGoodsId = brickOrGoodsId;
    }

    public String getShipment() {
        return shipment;
    }

    public void setShipment(String shipment) {
        this.shipment = shipment;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tradingSheetId=").append(tradingSheetId);
        sb.append(", brickOrGoodsId=").append(brickOrGoodsId);
        sb.append(", shipment=").append(shipment);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}