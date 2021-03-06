package com.stock.dao.model.sys;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_id
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.username
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.password
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.signature
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String signature;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.pwd_modify_date
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Date pwdModifyDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.pwd_effective_day
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer pwdEffectiveDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.default_lang
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String defaultLang;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.can_login
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Short canLogin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.can_loginweb
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer canLoginweb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.status
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_detail_id
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer userDetailId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.type
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.smtp_server
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String smtpServer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.big_picture
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String bigPicture;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.small_picture
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String smallPicture;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.description
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.creator
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.create_time
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.amender
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer amender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.amend_time
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Date amendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.access_group
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer accessGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.is_deleted
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_id
     *
     * @return the value of sys_user.user_id
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_id
     *
     * @param userId the value for sys_user.user_id
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.username
     *
     * @return the value of sys_user.username
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.username
     *
     * @param username the value for sys_user.username
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.password
     *
     * @return the value of sys_user.password
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.password
     *
     * @param password the value for sys_user.password
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.signature
     *
     * @return the value of sys_user.signature
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getSignature() {
        return signature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.signature
     *
     * @param signature the value for sys_user.signature
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.pwd_modify_date
     *
     * @return the value of sys_user.pwd_modify_date
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Date getPwdModifyDate() {
        return pwdModifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.pwd_modify_date
     *
     * @param pwdModifyDate the value for sys_user.pwd_modify_date
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setPwdModifyDate(Date pwdModifyDate) {
        this.pwdModifyDate = pwdModifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.pwd_effective_day
     *
     * @return the value of sys_user.pwd_effective_day
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getPwdEffectiveDay() {
        return pwdEffectiveDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.pwd_effective_day
     *
     * @param pwdEffectiveDay the value for sys_user.pwd_effective_day
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setPwdEffectiveDay(Integer pwdEffectiveDay) {
        this.pwdEffectiveDay = pwdEffectiveDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.default_lang
     *
     * @return the value of sys_user.default_lang
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getDefaultLang() {
        return defaultLang;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.default_lang
     *
     * @param defaultLang the value for sys_user.default_lang
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setDefaultLang(String defaultLang) {
        this.defaultLang = defaultLang == null ? null : defaultLang.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.can_login
     *
     * @return the value of sys_user.can_login
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Short getCanLogin() {
        return canLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.can_login
     *
     * @param canLogin the value for sys_user.can_login
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setCanLogin(Short canLogin) {
        this.canLogin = canLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.can_loginweb
     *
     * @return the value of sys_user.can_loginweb
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getCanLoginweb() {
        return canLoginweb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.can_loginweb
     *
     * @param canLoginweb the value for sys_user.can_loginweb
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setCanLoginweb(Integer canLoginweb) {
        this.canLoginweb = canLoginweb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.status
     *
     * @return the value of sys_user.status
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.status
     *
     * @param status the value for sys_user.status
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_detail_id
     *
     * @return the value of sys_user.user_detail_id
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getUserDetailId() {
        return userDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_detail_id
     *
     * @param userDetailId the value for sys_user.user_detail_id
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setUserDetailId(Integer userDetailId) {
        this.userDetailId = userDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.type
     *
     * @return the value of sys_user.type
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.type
     *
     * @param type the value for sys_user.type
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.smtp_server
     *
     * @return the value of sys_user.smtp_server
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getSmtpServer() {
        return smtpServer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.smtp_server
     *
     * @param smtpServer the value for sys_user.smtp_server
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setSmtpServer(String smtpServer) {
        this.smtpServer = smtpServer == null ? null : smtpServer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.big_picture
     *
     * @return the value of sys_user.big_picture
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getBigPicture() {
        return bigPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.big_picture
     *
     * @param bigPicture the value for sys_user.big_picture
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setBigPicture(String bigPicture) {
        this.bigPicture = bigPicture == null ? null : bigPicture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.small_picture
     *
     * @return the value of sys_user.small_picture
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getSmallPicture() {
        return smallPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.small_picture
     *
     * @param smallPicture the value for sys_user.small_picture
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setSmallPicture(String smallPicture) {
        this.smallPicture = smallPicture == null ? null : smallPicture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.description
     *
     * @return the value of sys_user.description
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.description
     *
     * @param description the value for sys_user.description
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.creator
     *
     * @return the value of sys_user.creator
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.creator
     *
     * @param creator the value for sys_user.creator
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.create_time
     *
     * @return the value of sys_user.create_time
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.create_time
     *
     * @param createTime the value for sys_user.create_time
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.amender
     *
     * @return the value of sys_user.amender
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getAmender() {
        return amender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.amender
     *
     * @param amender the value for sys_user.amender
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setAmender(Integer amender) {
        this.amender = amender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.amend_time
     *
     * @return the value of sys_user.amend_time
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Date getAmendTime() {
        return amendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.amend_time
     *
     * @param amendTime the value for sys_user.amend_time
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setAmendTime(Date amendTime) {
        this.amendTime = amendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.access_group
     *
     * @return the value of sys_user.access_group
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getAccessGroup() {
        return accessGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.access_group
     *
     * @param accessGroup the value for sys_user.access_group
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setAccessGroup(Integer accessGroup) {
        this.accessGroup = accessGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.is_deleted
     *
     * @return the value of sys_user.is_deleted
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.is_deleted
     *
     * @param isDeleted the value for sys_user.is_deleted
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
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
        SysUser other = (SysUser) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSignature() == null ? other.getSignature() == null : this.getSignature().equals(other.getSignature()))
            && (this.getPwdModifyDate() == null ? other.getPwdModifyDate() == null : this.getPwdModifyDate().equals(other.getPwdModifyDate()))
            && (this.getPwdEffectiveDay() == null ? other.getPwdEffectiveDay() == null : this.getPwdEffectiveDay().equals(other.getPwdEffectiveDay()))
            && (this.getDefaultLang() == null ? other.getDefaultLang() == null : this.getDefaultLang().equals(other.getDefaultLang()))
            && (this.getCanLogin() == null ? other.getCanLogin() == null : this.getCanLogin().equals(other.getCanLogin()))
            && (this.getCanLoginweb() == null ? other.getCanLoginweb() == null : this.getCanLoginweb().equals(other.getCanLoginweb()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUserDetailId() == null ? other.getUserDetailId() == null : this.getUserDetailId().equals(other.getUserDetailId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getSmtpServer() == null ? other.getSmtpServer() == null : this.getSmtpServer().equals(other.getSmtpServer()))
            && (this.getBigPicture() == null ? other.getBigPicture() == null : this.getBigPicture().equals(other.getBigPicture()))
            && (this.getSmallPicture() == null ? other.getSmallPicture() == null : this.getSmallPicture().equals(other.getSmallPicture()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getAmender() == null ? other.getAmender() == null : this.getAmender().equals(other.getAmender()))
            && (this.getAmendTime() == null ? other.getAmendTime() == null : this.getAmendTime().equals(other.getAmendTime()))
            && (this.getAccessGroup() == null ? other.getAccessGroup() == null : this.getAccessGroup().equals(other.getAccessGroup()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSignature() == null) ? 0 : getSignature().hashCode());
        result = prime * result + ((getPwdModifyDate() == null) ? 0 : getPwdModifyDate().hashCode());
        result = prime * result + ((getPwdEffectiveDay() == null) ? 0 : getPwdEffectiveDay().hashCode());
        result = prime * result + ((getDefaultLang() == null) ? 0 : getDefaultLang().hashCode());
        result = prime * result + ((getCanLogin() == null) ? 0 : getCanLogin().hashCode());
        result = prime * result + ((getCanLoginweb() == null) ? 0 : getCanLoginweb().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUserDetailId() == null) ? 0 : getUserDetailId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getSmtpServer() == null) ? 0 : getSmtpServer().hashCode());
        result = prime * result + ((getBigPicture() == null) ? 0 : getBigPicture().hashCode());
        result = prime * result + ((getSmallPicture() == null) ? 0 : getSmallPicture().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getAmender() == null) ? 0 : getAmender().hashCode());
        result = prime * result + ((getAmendTime() == null) ? 0 : getAmendTime().hashCode());
        result = prime * result + ((getAccessGroup() == null) ? 0 : getAccessGroup().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", signature=").append(signature);
        sb.append(", pwdModifyDate=").append(pwdModifyDate);
        sb.append(", pwdEffectiveDay=").append(pwdEffectiveDay);
        sb.append(", defaultLang=").append(defaultLang);
        sb.append(", canLogin=").append(canLogin);
        sb.append(", canLoginweb=").append(canLoginweb);
        sb.append(", status=").append(status);
        sb.append(", userDetailId=").append(userDetailId);
        sb.append(", type=").append(type);
        sb.append(", smtpServer=").append(smtpServer);
        sb.append(", bigPicture=").append(bigPicture);
        sb.append(", smallPicture=").append(smallPicture);
        sb.append(", description=").append(description);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", amender=").append(amender);
        sb.append(", amendTime=").append(amendTime);
        sb.append(", accessGroup=").append(accessGroup);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}