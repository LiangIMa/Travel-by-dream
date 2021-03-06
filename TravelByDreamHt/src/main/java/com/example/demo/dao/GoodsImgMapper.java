package com.example.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.demo.entity.GoodsImg;


public interface GoodsImgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbggenerated Tue Jun 26 23:48:45 CST 2018
     */
    int countByExample(GoodsImg example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbggenerated Tue Jun 26 23:48:45 CST 2018
     */
    int deleteByExample(GoodsImg example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbggenerated Tue Jun 26 23:48:45 CST 2018
     */
    int deleteByPrimaryKey(String imgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbggenerated Tue Jun 26 23:48:45 CST 2018
     */
    int insert(GoodsImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbggenerated Tue Jun 26 23:48:45 CST 2018
     */
    int insertSelective(GoodsImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbggenerated Tue Jun 26 23:48:45 CST 2018
     */
    List<GoodsImg> selectByExample(GoodsImg example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbggenerated Tue Jun 26 23:48:45 CST 2018
     */
    GoodsImg selectByPrimaryKey(String imgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbggenerated Tue Jun 26 23:48:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") GoodsImg record, @Param("example") GoodsImg example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbggenerated Tue Jun 26 23:48:45 CST 2018
     */
    int updateByExample(@Param("record") GoodsImg record, @Param("example") GoodsImg example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbggenerated Tue Jun 26 23:48:45 CST 2018
     */
    int updateByPrimaryKeySelective(GoodsImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbggenerated Tue Jun 26 23:48:45 CST 2018
     */
    int updateByPrimaryKey(GoodsImg record);

    int insertImgList(List<GoodsImg> goodsImgList);

    List<GoodsImg> selectGoodsImgById(String goodsId);
}