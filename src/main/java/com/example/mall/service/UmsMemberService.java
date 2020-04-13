package com.example.mall.service;

import com.example.mall.common.CommonResult;

/**
 * Description
 *
 * @author : Charles
 * @date : 2020/4/13
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
