package com.heheda.utils.project.user.entity;

import com.heheda.utils.framework.web.domain.BaseEntity;
import lombok.Data;

/**
 * @author chen
 * @title: UserBean
 * @projectName utils
 * @description: TODO
 * @date 2019-06-1817:22
 */
@Data
public class UserBean extends BaseEntity {

    private int pNo;
    private String pName;
    private String pSex;
    private Integer pAge;
    private String pAdress;
}