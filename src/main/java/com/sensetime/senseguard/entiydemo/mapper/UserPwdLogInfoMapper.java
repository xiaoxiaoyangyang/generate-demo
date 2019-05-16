package com.sensetime.senseguard.entiydemo.mapper;

import com.sensetime.senseguard.entiydemo.entity.UserLoginInfo;
import com.sensetime.senseguard.entiydemo.entity.userPwdLogInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author guozhiyang_vendor
 */
@Mapper
public interface UserPwdLogInfoMapper {
    int deleteByPrimaryKey(Long pwdLogId);

    int insert(userPwdLogInfo record);

    userPwdLogInfo selectByPrimaryKey(Long pwdLogId);

    int updateByPrimaryKeySelective(userPwdLogInfo record);

    int updateByPrimaryKey(userPwdLogInfo record);

    UserLoginInfo findPwdTime(@Param("userId") long userId);

}