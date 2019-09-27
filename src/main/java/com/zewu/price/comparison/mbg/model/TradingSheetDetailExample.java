package com.zewu.price.comparison.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class TradingSheetDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradingSheetDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTradingSheetIdIsNull() {
            addCriterion("trading_sheet_id is null");
            return (Criteria) this;
        }

        public Criteria andTradingSheetIdIsNotNull() {
            addCriterion("trading_sheet_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradingSheetIdEqualTo(String value) {
            addCriterion("trading_sheet_id =", value, "tradingSheetId");
            return (Criteria) this;
        }

        public Criteria andTradingSheetIdNotEqualTo(String value) {
            addCriterion("trading_sheet_id <>", value, "tradingSheetId");
            return (Criteria) this;
        }

        public Criteria andTradingSheetIdGreaterThan(String value) {
            addCriterion("trading_sheet_id >", value, "tradingSheetId");
            return (Criteria) this;
        }

        public Criteria andTradingSheetIdGreaterThanOrEqualTo(String value) {
            addCriterion("trading_sheet_id >=", value, "tradingSheetId");
            return (Criteria) this;
        }

        public Criteria andTradingSheetIdLessThan(String value) {
            addCriterion("trading_sheet_id <", value, "tradingSheetId");
            return (Criteria) this;
        }

        public Criteria andTradingSheetIdLessThanOrEqualTo(String value) {
            addCriterion("trading_sheet_id <=", value, "tradingSheetId");
            return (Criteria) this;
        }

        public Criteria andTradingSheetIdLike(String value) {
            addCriterion("trading_sheet_id like", value, "tradingSheetId");
            return (Criteria) this;
        }

        public Criteria andTradingSheetIdNotLike(String value) {
            addCriterion("trading_sheet_id not like", value, "tradingSheetId");
            return (Criteria) this;
        }

        public Criteria andTradingSheetIdIn(List<String> values) {
            addCriterion("trading_sheet_id in", values, "tradingSheetId");
            return (Criteria) this;
        }

        public Criteria andTradingSheetIdNotIn(List<String> values) {
            addCriterion("trading_sheet_id not in", values, "tradingSheetId");
            return (Criteria) this;
        }

        public Criteria andTradingSheetIdBetween(String value1, String value2) {
            addCriterion("trading_sheet_id between", value1, value2, "tradingSheetId");
            return (Criteria) this;
        }

        public Criteria andTradingSheetIdNotBetween(String value1, String value2) {
            addCriterion("trading_sheet_id not between", value1, value2, "tradingSheetId");
            return (Criteria) this;
        }

        public Criteria andBrickOrGoodsIdIsNull() {
            addCriterion("brick_or_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andBrickOrGoodsIdIsNotNull() {
            addCriterion("brick_or_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrickOrGoodsIdEqualTo(String value) {
            addCriterion("brick_or_goods_id =", value, "brickOrGoodsId");
            return (Criteria) this;
        }

        public Criteria andBrickOrGoodsIdNotEqualTo(String value) {
            addCriterion("brick_or_goods_id <>", value, "brickOrGoodsId");
            return (Criteria) this;
        }

        public Criteria andBrickOrGoodsIdGreaterThan(String value) {
            addCriterion("brick_or_goods_id >", value, "brickOrGoodsId");
            return (Criteria) this;
        }

        public Criteria andBrickOrGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("brick_or_goods_id >=", value, "brickOrGoodsId");
            return (Criteria) this;
        }

        public Criteria andBrickOrGoodsIdLessThan(String value) {
            addCriterion("brick_or_goods_id <", value, "brickOrGoodsId");
            return (Criteria) this;
        }

        public Criteria andBrickOrGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("brick_or_goods_id <=", value, "brickOrGoodsId");
            return (Criteria) this;
        }

        public Criteria andBrickOrGoodsIdLike(String value) {
            addCriterion("brick_or_goods_id like", value, "brickOrGoodsId");
            return (Criteria) this;
        }

        public Criteria andBrickOrGoodsIdNotLike(String value) {
            addCriterion("brick_or_goods_id not like", value, "brickOrGoodsId");
            return (Criteria) this;
        }

        public Criteria andBrickOrGoodsIdIn(List<String> values) {
            addCriterion("brick_or_goods_id in", values, "brickOrGoodsId");
            return (Criteria) this;
        }

        public Criteria andBrickOrGoodsIdNotIn(List<String> values) {
            addCriterion("brick_or_goods_id not in", values, "brickOrGoodsId");
            return (Criteria) this;
        }

        public Criteria andBrickOrGoodsIdBetween(String value1, String value2) {
            addCriterion("brick_or_goods_id between", value1, value2, "brickOrGoodsId");
            return (Criteria) this;
        }

        public Criteria andBrickOrGoodsIdNotBetween(String value1, String value2) {
            addCriterion("brick_or_goods_id not between", value1, value2, "brickOrGoodsId");
            return (Criteria) this;
        }

        public Criteria andShipmentIsNull() {
            addCriterion("shipment is null");
            return (Criteria) this;
        }

        public Criteria andShipmentIsNotNull() {
            addCriterion("shipment is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentEqualTo(String value) {
            addCriterion("shipment =", value, "shipment");
            return (Criteria) this;
        }

        public Criteria andShipmentNotEqualTo(String value) {
            addCriterion("shipment <>", value, "shipment");
            return (Criteria) this;
        }

        public Criteria andShipmentGreaterThan(String value) {
            addCriterion("shipment >", value, "shipment");
            return (Criteria) this;
        }

        public Criteria andShipmentGreaterThanOrEqualTo(String value) {
            addCriterion("shipment >=", value, "shipment");
            return (Criteria) this;
        }

        public Criteria andShipmentLessThan(String value) {
            addCriterion("shipment <", value, "shipment");
            return (Criteria) this;
        }

        public Criteria andShipmentLessThanOrEqualTo(String value) {
            addCriterion("shipment <=", value, "shipment");
            return (Criteria) this;
        }

        public Criteria andShipmentLike(String value) {
            addCriterion("shipment like", value, "shipment");
            return (Criteria) this;
        }

        public Criteria andShipmentNotLike(String value) {
            addCriterion("shipment not like", value, "shipment");
            return (Criteria) this;
        }

        public Criteria andShipmentIn(List<String> values) {
            addCriterion("shipment in", values, "shipment");
            return (Criteria) this;
        }

        public Criteria andShipmentNotIn(List<String> values) {
            addCriterion("shipment not in", values, "shipment");
            return (Criteria) this;
        }

        public Criteria andShipmentBetween(String value1, String value2) {
            addCriterion("shipment between", value1, value2, "shipment");
            return (Criteria) this;
        }

        public Criteria andShipmentNotBetween(String value1, String value2) {
            addCriterion("shipment not between", value1, value2, "shipment");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(String value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(String value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(String value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(String value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(String value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(String value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLike(String value) {
            addCriterion("unit_price like", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotLike(String value) {
            addCriterion("unit_price not like", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<String> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<String> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(String value1, String value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(String value1, String value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(String value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(String value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(String value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(String value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(String value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(String value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLike(String value) {
            addCriterion("total_price like", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotLike(String value) {
            addCriterion("total_price not like", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<String> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<String> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(String value1, String value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(String value1, String value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}