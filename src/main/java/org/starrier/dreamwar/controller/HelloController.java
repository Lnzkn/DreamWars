package org.starrier.dreamwar.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.starrier.dreamwar.entity.User;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

/**
 * @Author Starrier
 * @Time 2018/2/1.
 */
@RestController
@RequestMapping("/test")
@Api(tags="与检查单有关的接口")
public class HelloController {

    @ApiOperation(value = "获得hello字符串JSON", response = String.class, produces = APPLICATION_JSON_VALUE
            ,notes = "根据User对象创建用户")
    @RequestMapping(value = { "/hello" }, method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @ApiOperation(value = "修改用户", response = String.class, produces = APPLICATION_JSON_VALUE
            ,notes = "根据id修改用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value = { "/modifyUser" }, method = RequestMethod.POST)
    public User modifyUser(@RequestBody User user) {
        user.setName("张三");
        user.setAge(20);
        return user;
    }

}
