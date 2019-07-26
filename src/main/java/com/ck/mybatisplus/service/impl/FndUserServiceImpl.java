package com.ck.mybatisplus.service.impl;

import com.ck.mybatisplus.entity.FndUser;
import com.ck.mybatisplus.mapper.FndUserMapper;
import com.ck.mybatisplus.service.IFndUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基础表 服务实现类
 * </p>
 *
 * @author ck
 * @since 2019-07-26
 */
@Service
public class FndUserServiceImpl extends ServiceImpl<FndUserMapper, FndUser> implements IFndUserService {

}
