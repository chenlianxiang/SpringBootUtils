package com.heheda.utils.project.user.service;

import com.heheda.utils.project.user.entity.UserBean;
import com.heheda.utils.project.user.mapper.UserMapper;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chen
 * @title: UserServiceImpl
 * @projectName utils
 * @description: TODO
 * @date 2019-06-1817:47
 */
@Service
public class UserServiceImpl implements IUserService {

    /**
     * 用户对象
     */
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserBean> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public Integer istUser(List<UserBean> userBeans) {
        return userMapper.istUser(userBeans);
    }
}
