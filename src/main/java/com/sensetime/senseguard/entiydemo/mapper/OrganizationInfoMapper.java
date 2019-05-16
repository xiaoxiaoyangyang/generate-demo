package com.sensetime.senseguard.entiydemo.mapper;


import com.sensetime.senseguard.entiydemo.entity.OrganizationInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author guozhiyang_vendor
 */
@Mapper
public interface OrganizationInfoMapper {
    int deleteByPrimaryKey(Long orgId);

    int insert(OrganizationInfo record);

    int updateByPrimaryKeySelective(OrganizationInfo record);

    OrganizationInfo selectByPrimaryKey(Long orgId);


    int updateByPrimaryKey(OrganizationInfo record);
}