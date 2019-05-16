package com.sensetime.senseguard.entiydemo.entity;

import java.util.Date;

/**
 * @author guozhiyang_vendor
 */
public class userPwdLogInfo {
    private Long pwdLogId;

    private Long userId;

    private String password;

    private Date createTime;

    public Long getPwdLogId() {
        return pwdLogId;
    }

    public void setPwdLogId(Long pwdLogId) {
        this.pwdLogId = pwdLogId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}