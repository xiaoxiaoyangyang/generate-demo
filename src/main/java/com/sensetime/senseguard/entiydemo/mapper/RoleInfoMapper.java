package com.sensetime.senseguard.entiydemo.mapper;

import com.sensetime.senseguard.entiydemo.entity.RoleInfo;
import com.sensetime.senseguard.entiydemo.entity.UserRoleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author guozhiyang_vendor
 */
@Mapper
public interface RoleInfoMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(RoleInfo record);

    RoleInfo selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(RoleInfo record);

    int updateByPrimaryKey(RoleInfo record);

    List<RoleInfo> listEnableRoleInfoById(@Param("userId")long userId);

    List<UserRoleInfo> queryUserRoleInfoById(long userId);
}