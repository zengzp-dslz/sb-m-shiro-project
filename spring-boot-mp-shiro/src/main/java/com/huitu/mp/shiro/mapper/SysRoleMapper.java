package com.huitu.mp.shiro.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.huitu.mp.shiro.entity.SysRole;
import com.huitu.mp.shiro.entity.UserInfo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author huitu123
 * @since 2018-01-23
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRole> selectRoleByUser(UserInfo userInfo);
}
