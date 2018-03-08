package com.huitu.mp.shiro.service.impl;

import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.huitu.mp.shiro.entity.SysRole;
import com.huitu.mp.shiro.entity.UserInfo;
import com.huitu.mp.shiro.mapper.SysRoleMapper;
import com.huitu.mp.shiro.service.SysRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huitu123
 * @since 2018-01-23
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Override
    public List<SysRole> selectRoleByUser(UserInfo userInfo) throws Exception{
        return baseMapper.selectRoleByUser(userInfo);
    }
}
