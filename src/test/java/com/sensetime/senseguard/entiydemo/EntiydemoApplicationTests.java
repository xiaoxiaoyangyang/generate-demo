package com.sensetime.senseguard.entiydemo;

import com.sensetime.senseguard.entiydemo.entity.*;
import com.sensetime.senseguard.entiydemo.mapper.*;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntiydemoApplicationTests {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private RoleInfoMapper roleInfoMapper;

    @Autowired
    private UserPwdLogInfoMapper userPwdLogInfoMapper;

    @Autowired
    private OrganizationInfoMapper organizationInfoMapper;

    @Autowired
    private PermissionInfoMapper permissionInfoMapper;

    @Test
    public void contextLoads() {
        UserInfo xiaoming = userInfoMapper.selectByName("xiaoming");
        System.out.println(xiaoming);
    }

    @Test
    public void testRole(){
        List<RoleInfo> roleInfos = roleInfoMapper.listEnableRoleInfoById(1L);
        System.out.println(roleInfos);
    }

    @Test
    public void testUerInfoPwd(){
        UserInfo userInfo = userInfoMapper.selectByPwd("1251326");
        System.out.println(userInfo);
    }

    @Test
    public void testUserPwdLog(){
        UserLoginInfo pwdTime = userPwdLogInfoMapper.findPwdTime(1L);
        System.out.println(pwdTime);
    }

    @Test
    public void testUserInfoUpdate(){
        UserInfo userInfo = new UserInfo();
        int i = userInfoMapper.updateUserErrNum(userInfo);
        System.out.println(i);
    }

    @Test
    public void testUserInfoUp(){
        UserInfo userInfo = new UserInfo();
        int i = userInfoMapper.updateUserLockState(userInfo);
        System.out.println(i);
    }
    @Test
    public void testOrg(){
        OrganizationInfo organizationInfo = organizationInfoMapper.selectByPrimaryKey(1L);
        System.out.println(organizationInfo);
    }

    @Test
    public void queryUserRoleInfoById(){
        List<UserRoleInfo> userRoleInfos = roleInfoMapper.queryUserRoleInfoById(1L);
        System.out.println(userRoleInfos);
    }

    @Test
    public void queryPermissionId(){
        List<RolePermission> rolePermissions = permissionInfoMapper.queryPermissionId(1L);
        System.out.println(rolePermissions);
    }

    @Test
    public void queryPermissionInfoByIds(){
        List<Long> longs = Arrays.asList(1L, 2L);
        List<PermissionInfo> permissionInfos = permissionInfoMapper.queryPermissionInfoByIds(longs);
        System.out.println(permissionInfos);
    }

}
