package com.huitu.mp.shiro.service;

import com.baomidou.mybatisplus.service.IService;
import com.huitu.mp.shiro.entity.SysPermission;
import com.huitu.mp.shiro.entity.UserInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huitu123
 * @since 2018-01-23
 */
public interface SysPermissionService extends IService<SysPermission> {

    List<SysPermission> selectPermByUser(UserInfo userInfo) throws Exception;
}
