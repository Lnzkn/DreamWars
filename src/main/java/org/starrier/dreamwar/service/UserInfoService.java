package org.starrier.dreamwar.service;

import org.starrier.dreamwar.entity.UserInfo;

/**
 * @Author Starrier
 * @Time 2018/2/1.
 */
public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUserName(String userName);
}
