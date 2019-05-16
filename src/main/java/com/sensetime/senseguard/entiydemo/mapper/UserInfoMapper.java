package com.sensetime.senseguard.entiydemo.mapper;

import com.sensetime.senseguard.entiydemo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * @author guozhiyang_vendor
 */
@Mapper
public interface UserInfoMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(UserInfo record);

   //更新实体类
    int updateByPrimaryKey(UserInfo record);



    //更新错误锁定时间
    int updateUserErrNum(UserInfo userInfo);

    //通过账号查询对象
    UserInfo selectByName(@Param("username")String username);

    //通过密码查询对象
    UserInfo selectByPwd(@Param("password")String password);

    //90更新密码
    int updateUserLockState(UserInfo userInfo);
}