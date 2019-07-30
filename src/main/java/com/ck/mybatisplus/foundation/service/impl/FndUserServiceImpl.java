package com.ck.mybatisplus.foundation.service.impl;

import com.ck.mybatisplus.foundation.entity.FndUser;
import com.ck.mybatisplus.foundation.mapper.FndUserMapper;
import com.ck.mybatisplus.foundation.service.IFndUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基础表 服务实现类
 * </p>
 *
 * @author ck
 * @since 2019-07-30
 */
@Service
public class FndUserServiceImpl extends ServiceImpl<FndUserMapper, FndUser> implements IFndUserService {

}
