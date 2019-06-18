package com.heheda.utils.project.user.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.heheda.utils.framework.web.controller.BaseController;
import com.heheda.utils.framework.web.domain.AjaxResult;
import com.heheda.utils.framework.web.page.TableDataInfo;
import com.heheda.utils.project.user.entity.UserBean;
import com.heheda.utils.project.user.service.IUserService;
import com.heheda.utils.project.user.service.UserServiceImpl;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author chen
 * @title: UserController
 * @projectName utils
 * @description: TODO
 * @date 2019-06-1817:15
 */
@RestController
@RequestMapping(value = "api/user")
public class UserController extends BaseController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "getUser")
    public TableDataInfo getUser(){
        startPage();
        List<UserBean> userList = userService.getUserList();
        return getDataTable(userList);
    }

    @RequestMapping(value = "istUser")
    public AjaxResult istUser(){
        List<UserBean> list= Lists.newArrayList();
        UserBean user=null;
        for (int i=0;i<1000;i++){
            user=new UserBean();
            user.setPNo(i);
            user.setPName("某某"+i+"号");
            user.setPAdress("上海市浦东新区");
            list.add(user);
        }

        System.out.println(JSON.toJSONString(list));
      return toAjax(userService.istUser(list));
    }
}
