package com.miracle.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miracle.usercenter.model.domain.User;

/**
 * 用户 服务
 * @author dargon
 * @create 2023-10-02
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @param planetCode    星球编号
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);
}
