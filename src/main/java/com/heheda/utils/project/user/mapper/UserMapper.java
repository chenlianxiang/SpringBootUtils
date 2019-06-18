package com.heheda.utils.project.user.mapper;

import com.heheda.utils.project.user.entity.UserBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author chen
 * @title: UserMapper
 * @projectName utils
 * @description: TODO
 * @date 2019-06-1817:45
 */
@Repository
public interface UserMapper {

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
    Integer istUser(List<UserBean> list);
}
