package com.sensetime.senseguard.entiydemo.mapper;

import com.sensetime.senseguard.entiydemo.entity.UserLoginInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author guozhiyang_vendor
 */
@Mapper
public interface UserLoginInfoMapper {
    int deleteByPrimaryKey(Long loginInfoId);

    int insert(UserLoginInfo record);

    UserLoginInfo selectByPrimaryKey(Long loginInfoId);

    int updateByPrimaryKeySelective(UserLoginInfo record);

    int updateByPrimaryKeyWithBLOBs(UserLoginInfo record);

    int updateByPrimaryKey(UserLoginInfo record);
}