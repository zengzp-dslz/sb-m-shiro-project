package com.huitu.mp.shiro.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.huitu.mp.shiro.entity.SysPermission;
import com.huitu.mp.shiro.entity.UserInfo;
import com.huitu.mp.shiro.mapper.SysPermissionMapper;
import com.huitu.mp.shiro.service.SysPermissionService;
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
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements SysPermissionService {

    @Override
    public List<SysPermission> selectPermByUser(UserInfo userInfo) throws Exception {
        return baseMapper.selectPermByUser(userInfo);
    }
}
