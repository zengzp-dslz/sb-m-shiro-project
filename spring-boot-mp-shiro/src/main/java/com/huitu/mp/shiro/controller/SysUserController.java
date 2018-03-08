package com.huitu.mp.shiro.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.huitu.mp.shiro.entity.SysUser;
import com.huitu.mp.shiro.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/1/15.
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * AR 部分测试
     */
    @GetMapping("/test1")
    public Page<SysUser> test1() {
        try {
            sysUserService.myTest();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/test2")
    public Object test2() {
        try {
            return sysUserService.myTest2();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
