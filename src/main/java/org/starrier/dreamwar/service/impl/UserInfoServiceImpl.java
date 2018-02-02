package org.starrier.dreamwar.service.impl;

import org.starrier.dreamwar.dao.UserInfoDao;
import org.starrier.dreamwar.entity.UserInfo;
import org.starrier.dreamwar.service.UserInfoService;

import javax.annotation.Resource;

/**
 * @Author Starrier
 * @Time 2018/2/1.
 */
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUserName(String UserName) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUserName(UserName);
    }
}
