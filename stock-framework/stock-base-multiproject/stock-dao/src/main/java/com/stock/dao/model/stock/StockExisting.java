package com.stock.dao.model.stock;

import java.io.Serializable;
import java.util.Date;

public class StockExisting implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_existing.existing_id
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    private Integer existingId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_existing.stock_id
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    private Integer stockId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_existing.stock_account_id
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    private Integer stockAccountId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_existing.stock_available_sell_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    private Integer stockAvailableSellNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_existing.stock_own_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    private Integer stockOwnNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_existing.cost_price
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    private Double costPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_existing.balance_id
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    private Integer balanceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_existing.creator
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    private Integer creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_existing.create_time
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_existing.amender
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    private Integer amender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_existing.amend_time
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    private Date amendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_existing.access_group
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    private Integer accessGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_existing.existing_id
     *
     * @return the value of stock_existing.existing_id
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Integer getExistingId() {
        return existingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_existing.existing_id
     *
     * @param existingId the value for stock_existing.existing_id
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setExistingId(Integer existingId) {
        this.existingId = existingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_existing.stock_id
     *
     * @return the value of stock_existing.stock_id
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Integer getStockId() {
        return stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_existing.stock_id
     *
     * @param stockId the value for stock_existing.stock_id
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_existing.stock_account_id
     *
     * @return the value of stock_existing.stock_account_id
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Integer getStockAccountId() {
        return stockAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_existing.stock_account_id
     *
     * @param stockAccountId the value for stock_existing.stock_account_id
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setStockAccountId(Integer stockAccountId) {
        this.stockAccountId = stockAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_existing.stock_available_sell_num
     *
     * @return the value of stock_existing.stock_available_sell_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Integer getStockAvailableSellNum() {
        return stockAvailableSellNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_existing.stock_available_sell_num
     *
     * @param stockAvailableSellNum the value for stock_existing.stock_available_sell_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setStockAvailableSellNum(Integer stockAvailableSellNum) {
        this.stockAvailableSellNum = stockAvailableSellNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_existing.stock_own_num
     *
     * @return the value of stock_existing.stock_own_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Integer getStockOwnNum() {
        return stockOwnNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_existing.stock_own_num
     *
     * @param stockOwnNum the value for stock_existing.stock_own_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setStockOwnNum(Integer stockOwnNum) {
        this.stockOwnNum = stockOwnNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_existing.cost_price
     *
     * @return the value of stock_existing.cost_price
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Double getCostPrice() {
        return costPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_existing.cost_price
     *
     * @param costPrice the value for stock_existing.cost_price
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_existing.balance_id
     *
     * @return the value of stock_existing.balance_id
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Integer getBalanceId() {
        return balanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_existing.balance_id
     *
     * @param balanceId the value for stock_existing.balance_id
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setBalanceId(Integer balanceId) {
        this.balanceId = balanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_existing.creator
     *
     * @return the value of stock_existing.creator
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_existing.creator
     *
     * @param creator the value for stock_existing.creator
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_existing.create_time
     *
     * @return the value of stock_existing.create_time
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_existing.create_time
     *
     * @param createTime the value for stock_existing.create_time
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_existing.amender
     *
     * @return the value of stock_existing.amender
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Integer getAmender() {
        return amender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_existing.amender
     *
     * @param amender the value for stock_existing.amender
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setAmender(Integer amender) {
        this.amender = amender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_existing.amend_time
     *
     * @return the value of stock_existing.amend_time
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Date getAmendTime() {
        return amendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_existing.amend_time
     *
     * @param amendTime the value for stock_existing.amend_time
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setAmendTime(Date amendTime) {
        this.amendTime = amendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_existing.access_group
     *
     * @return the value of stock_existing.access_group
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Integer getAccessGroup() {
        return accessGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_existing.access_group
     *
     * @param accessGroup the value for stock_existing.access_group
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setAccessGroup(Integer accessGroup) {
        this.accessGroup = accessGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StockExisting other = (StockExisting) that;
        return (this.getExistingId() == null ? other.getExistingId() == null : this.getExistingId().equals(other.getExistingId()))
            && (this.getStockId() == null ? other.getStockId() == null : this.getStockId().equals(other.getStockId()))
            && (this.getStockAccountId() == null ? other.getStockAccountId() == null : this.getStockAccountId().equals(other.getStockAccountId()))
            && (this.getStockAvailableSellNum() == null ? other.getStockAvailableSellNum() == null : this.getStockAvailableSellNum().equals(other.getStockAvailableSellNum()))
            && (this.getStockOwnNum() == null ? other.getStockOwnNum() == null : this.getStockOwnNum().equals(other.getStockOwnNum()))
            && (this.getCostPrice() == null ? other.getCostPrice() == null : this.getCostPrice().equals(other.getCostPrice()))
            && (this.getBalanceId() == null ? other.getBalanceId() == null : this.getBalanceId().equals(other.getBalanceId()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getAmender() == null ? other.getAmender() == null : this.getAmender().equals(other.getAmender()))
            && (this.getAmendTime() == null ? other.getAmendTime() == null : this.getAmendTime().equals(other.getAmendTime()))
            && (this.getAccessGroup() == null ? other.getAccessGroup() == null : this.getAccessGroup().equals(other.getAccessGroup()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExistingId() == null) ? 0 : getExistingId().hashCode());
        result = prime * result + ((getStockId() == null) ? 0 : getStockId().hashCode());
        result = prime * result + ((getStockAccountId() == null) ? 0 : getStockAccountId().hashCode());
        result = prime * result + ((getStockAvailableSellNum() == null) ? 0 : getStockAvailableSellNum().hashCode());
        result = prime * result + ((getStockOwnNum() == null) ? 0 : getStockOwnNum().hashCode());
        result = prime * result + ((getCostPrice() == null) ? 0 : getCostPrice().hashCode());
        result = prime * result + ((getBalanceId() == null) ? 0 : getBalanceId().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getAmender() == null) ? 0 : getAmender().hashCode());
        result = prime * result + ((getAmendTime() == null) ? 0 : getAmendTime().hashCode());
        result = prime * result + ((getAccessGroup() == null) ? 0 : getAccessGroup().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", existingId=").append(existingId);
        sb.append(", stockId=").append(stockId);
        sb.append(", stockAccountId=").append(stockAccountId);
        sb.append(", stockAvailableSellNum=").append(stockAvailableSellNum);
        sb.append(", stockOwnNum=").append(stockOwnNum);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", balanceId=").append(balanceId);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", amender=").append(amender);
        sb.append(", amendTime=").append(amendTime);
        sb.append(", accessGroup=").append(accessGroup);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}