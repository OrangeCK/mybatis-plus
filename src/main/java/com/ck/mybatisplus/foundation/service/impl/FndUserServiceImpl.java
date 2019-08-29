package com.ck.mybatisplus.foundation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.ck.mybatisplus.foundation.entity.FndUser;
import com.ck.mybatisplus.foundation.mapper.FndUserMapper;
import com.ck.mybatisplus.foundation.service.IFndUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<FndUser> simpleQuery(FndUser fndUser) {
        QueryWrapper<FndUser> fndUserQueryWrapper = new QueryWrapper<>();
        // 等于= 例: eq("name", "老王")--->name = '老王'
        fndUserQueryWrapper.eq("job_number", fndUser.getJobNumber());
        // 大于等于 >= 例: ge("age", 18)--->age >= 18
        fndUserQueryWrapper.ge("age", fndUser.getAge());
        // LIKE '%值%' 例: like("name", "王")--->name like '%王%'
        fndUserQueryWrapper.like("login_name", fndUser.getLoginName());
        // 排序：ORDER BY 字段, ... DESC 例: orderByDesc("id", "name")--->order by id DESC,name DESC
        fndUserQueryWrapper.orderByDesc("s_ct","job_number");
        // Mapper的查询接口（当然对应的删除、更新、插入接口都是有的）
        return baseMapper.selectList(fndUserQueryWrapper);
    }

    @Override
    public List<FndUser> lambdaSimpleQuery(FndUser fndUser) {
        LambdaQueryWrapper<FndUser> fndUserLambdaQueryWrapper = new LambdaQueryWrapper<>();
        fndUserLambdaQueryWrapper
                // 等于= 例: eq("name", "老王")--->name = '老王'
                .eq(FndUser::getJobNumber, fndUser.getJobNumber())
                // 大于等于 >= 例: ge("age", 18)--->age >= 18
                .ge(FndUser::getAge, fndUser.getAge())
                // LIKE '%值%' 例: like("name", "王")--->name like '%王%'
                .like(FndUser::getLoginName, fndUser.getLoginName())
                // 排序：ORDER BY 字段, ... DESC 例: orderByDesc("id", "name")--->order by id DESC,name DESC
                .orderByDesc(FndUser::getSCt, FndUser::getJobNumber);
        // Service的查询接口（和Mapper的selectList接口时差不多的意思，）
        return super.list(fndUserLambdaQueryWrapper);
    }

    @Override
    public void simpleUpdate(FndUser fndUser) {
        UpdateWrapper<FndUser> fndUserUpdateWrapper = new UpdateWrapper<>();
        // .lambda()这种形式和LambdaUpdateWrapper是一个意思
        fndUserUpdateWrapper.lambda().set(FndUser::getJobNumber, fndUser.getJobNumber())
                .set(FndUser::getLoginName, fndUser.getLoginName());
        super.update(fndUserUpdateWrapper);
    }
}
