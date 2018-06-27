package com.example.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.demo.entity.OrderManage;

public interface OrderManageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_management
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    int countByExample(OrderManage example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_management
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    int deleteByExample(OrderManage example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_management
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    int deleteByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_management
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    int insert(OrderManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_management
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    int insertSelective(OrderManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_management
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    List<OrderManage> selectByExample(OrderManage example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_management
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    OrderManage selectByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_management
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    int updateByExampleSelective(@Param("record") OrderManage record, @Param("example") OrderManage example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_management
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    int updateByExample(@Param("record") OrderManage record, @Param("example") OrderManage example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_management
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    int updateByPrimaryKeySelective(OrderManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_management
     *
     * @mbggenerated Wed Jun 27 21:59:36 CST 2018
     */
    int updateByPrimaryKey(OrderManage record);
}