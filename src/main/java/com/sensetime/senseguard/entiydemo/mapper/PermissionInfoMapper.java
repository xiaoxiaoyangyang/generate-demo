package com.sensetime.senseguard.entiydemo.mapper;

import com.sensetime.senseguard.entiydemo.entity.PermissionInfo;
import com.sensetime.senseguard.entiydemo.entity.RolePermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author guozhiyang_vendor
 */
@Mapper
public interface PermissionInfoMapper {
    int deleteByPrimaryKey(Long permissionId);

    int insert(PermissionInfo record);

    PermissionInfo selectByPrimaryKey(Long permissionId);

    int updateByPrimaryKeySelective(PermissionInfo record);

    int updateByPrimaryKey(PermissionInfo record);

    List<RolePermission> queryPermissionId(Long roleId);

    List<PermissionInfo> queryPermissionInfoByIds(@Param("ids") List<Long> ids);
}