package com.example.demo.entity;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_id
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_name
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_sex
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    private String userSex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_phone
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    private String userPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_pw
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    private String userPw;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_type
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    private String userType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_id
     *
     * @return the value of user_info.user_id
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_id
     *
     * @param userId the value for user_info.user_id
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_name
     *
     * @return the value of user_info.user_name
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_name
     *
     * @param userName the value for user_info.user_name
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_sex
     *
     * @return the value of user_info.user_sex
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_sex
     *
     * @param userSex the value for user_info.user_sex
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_phone
     *
     * @return the value of user_info.user_phone
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_phone
     *
     * @param userPhone the value for user_info.user_phone
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_pw
     *
     * @return the value of user_info.user_pw
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    public String getUserPw() {
        return userPw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_pw
     *
     * @param userPw the value for user_info.user_pw
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    public void setUserPw(String userPw) {
        this.userPw = userPw == null ? null : userPw.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_type
     *
     * @return the value of user_info.user_type
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_type
     *
     * @param userType the value for user_info.user_type
     *
     * @mbggenerated Wed Jun 27 22:21:09 CST 2018
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }
}