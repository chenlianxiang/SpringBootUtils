package com.heheda.utils.project.user.service;

import com.heheda.utils.project.user.entity.UserBean;

import java.util.List;

/**
 * @author chen
 * @title: IUserService
 * @projectName utils
 * @description: TODO
 * @date 2019-06-1817:46
 */
public interface IUserService {
    /**
     * 查询 用户列表
     * @return
     */
    List<UserBean> getUserList();

    /**
     * 插入 插入用户
     * @param userBeans
     * @return
     */
    Integer istUser(List<UserBean> userBeans);
}
