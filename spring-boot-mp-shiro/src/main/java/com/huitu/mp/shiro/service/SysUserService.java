package com.huitu.mp.shiro.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.huitu.mp.shiro.entity.SysUser;

/**
 * Created by Administrator on 2018/1/12.
 */
public interface SysUserService extends IService<SysUser>{

    void myTest() throws Exception;

    Page<SysUser> myTest2() throws Exception;
}
