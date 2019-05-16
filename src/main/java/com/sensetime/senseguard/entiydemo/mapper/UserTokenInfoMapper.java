package com.sensetime.senseguard.entiydemo.mapper;

import com.sensetime.senseguard.entiydemo.entity.UserTokenInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author guozhiyang_vendor
 */
@Mapper
public interface UserTokenInfoMapper {
    int deleteByPrimaryKey(Long tokenId);

    int insert(UserTokenInfo record);


    UserTokenInfo selectByPrimaryKey(Long tokenId);

    int updateByPrimaryKeySelective(UserTokenInfo record);

    int updateByPrimaryKey(UserTokenInfo record);
}