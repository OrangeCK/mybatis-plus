package com.ck.mybatisplus.foundation.service;

import com.ck.mybatisplus.foundation.entity.FndUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户基础表 服务类
 * </p>
 *
 * @author ck
 * @since 2019-07-30
 */
public interface IFndUserService extends IService<FndUser> {

    List<FndUser> simpleQuery(FndUser fndUser);

    List<FndUser> lambdaSimpleQuery(FndUser fndUser);

}
