package org.starrier.dreamwar.dao;

import org.springframework.data.repository.CrudRepository;
import org.starrier.dreamwar.entity.UserInfo;

/**
 * @Author Starrier
 * @Time 2018/2/1.
 */
public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    public UserInfo findByUserName(String UserName);
}
