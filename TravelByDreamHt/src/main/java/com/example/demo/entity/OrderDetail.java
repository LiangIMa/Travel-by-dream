package com.example.demo.entity;

public class OrderDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.order_detail_id
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    private Integer orderDetailId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.order_id
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.goods_id
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.orde_number
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    private Integer ordeNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.order_price
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    private Double orderPrice;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.order_detail_id
     *
     * @return the value of order_detail.order_detail_id
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.order_detail_id
     *
     * @param orderDetailId the value for order_detail.order_detail_id
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.order_id
     *
     * @return the value of order_detail.order_id
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.order_id
     *
     * @param orderId the value for order_detail.order_id
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.goods_id
     *
     * @return the value of order_detail.goods_id
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.goods_id
     *
     * @param goodsId the value for order_detail.goods_id
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.orde_number
     *
     * @return the value of order_detail.orde_number
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    public Integer getOrdeNumber() {
        return ordeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.orde_number
     *
     * @param ordeNumber the value for order_detail.orde_number
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    public void setOrdeNumber(Integer ordeNumber) {
        this.ordeNumber = ordeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.order_price
     *
     * @return the value of order_detail.order_price
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    public Double getOrderPrice() {
        return orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.order_price
     *
     * @param orderPrice the value for order_detail.order_price
     *
     * @mbggenerated Wed Jun 27 21:13:16 CST 2018
     */
    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }
}