package com.example.demo.entity;

import java.util.Date;

public class OrderManage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_management.order_id
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_management.user_id
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_management.consignee_id
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    private Integer consigneeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_management.order_time
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    private Date orderTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_management.order_total
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    private Double orderTotal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_management.order_state
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    private String orderState;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_management.order_id
     *
     * @return the value of order_management.order_id
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_management.order_id
     *
     * @param orderId the value for order_management.order_id
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_management.user_id
     *
     * @return the value of order_management.user_id
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_management.user_id
     *
     * @param userId the value for order_management.user_id
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_management.consignee_id
     *
     * @return the value of order_management.consignee_id
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    public Integer getConsigneeId() {
        return consigneeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_management.consignee_id
     *
     * @param consigneeId the value for order_management.consignee_id
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    public void setConsigneeId(Integer consigneeId) {
        this.consigneeId = consigneeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_management.order_time
     *
     * @return the value of order_management.order_time
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_management.order_time
     *
     * @param orderTime the value for order_management.order_time
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_management.order_total
     *
     * @return the value of order_management.order_total
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    public Double getOrderTotal() {
        return orderTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_management.order_total
     *
     * @param orderTotal the value for order_management.order_total
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_management.order_state
     *
     * @return the value of order_management.order_state
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    public String getOrderState() {
        return orderState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_management.order_state
     *
     * @param orderState the value for order_management.order_state
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }
}