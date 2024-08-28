package com.zhajiangmian.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author zhajiangmian
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = -1234567890L;

    private String userAccount;

    private String userPassword;
}
