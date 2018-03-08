package com.huitu.mp.shiro.service;

import com.baomidou.mybatisplus.service.IService;
import com.huitu.mp.shiro.entity.SysRole;
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
public interface SysRoleService extends IService<SysRole> {

    List<SysRole> selectRoleByUser(UserInfo userInfo) throws Exception;
}
