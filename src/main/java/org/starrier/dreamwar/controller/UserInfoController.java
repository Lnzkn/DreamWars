package org.starrier.dreamwar.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Starrier
 * @Time 2018/2/1.
 *
 *  用户创建 POST      /userinfo/
 *  用户修改 PUT       /userinfo/:id/
 *  用户删除 DELETE    /userinfo/:id/
 *
 */

@RestController
@RequestMapping(value = "/userInfo")
public class UserInfoController {

    /**
     * 用户查询.
     * @return
     */
    @RequestMapping(value = "/userList",method = RequestMethod.GET)
    @ApiOperation(value = "查找用户",notes = "查找用户")
    @RequiresPermissions("userInfo:view")//权限管理;
    public String userInfo(){
        return "userInfo";
    }

    /**
     * 用户添加;
     * @return
     */
    @ApiOperation(value = "用户创建",notes = "用户创建")
    @ApiImplicitParam(name = "userName",value = "用户详细信息",required = true,dataType = "user")
    @RequestMapping(value = "/userAdd",method = RequestMethod.POST)
    @RequiresPermissions("userInfo:add")//权限管理;
    public String userInfoAdd(){
        return "userInfoAdd";
    }

    /**
     * 用户删除;
     * @return
     */
    @RequestMapping("/userDel")
    @RequiresPermissions("userInfo:del")//权限管理;
    public String userDel(){
        return "userInfoDel";
    }
}
