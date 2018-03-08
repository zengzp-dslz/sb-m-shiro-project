package com.huitu.mp.shiro.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.huitu.mp.shiro.entity.SysUser;
import com.huitu.mp.shiro.mapper.SysUserMapper;
import com.huitu.mp.shiro.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by Administrator on 2018/1/12.
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper,SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
    public void myTest() throws Exception {
//        DbContextHolder.setDbType(DBTypeEnum.shiro);
        SysUser user = new SysUser();
//        user.setId(UUID.randomUUID().toString());
        user.setUsername("alice");
        user.setPassword("123456");
        baseMapper.insert(user);
//        user.insert();
//        Aatest aatest = new Aatest();
//        aatest.setProid("123");
//        aatest.setContent("ksjdjf");
//        aatest.insert();
//        aatest.insert();
//        int i = 1/0;
//        System.err.println("查询插入结果：" + user.selectById().getUsername());
    }

    @Override
    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
    public Page<SysUser> myTest2() throws Exception {
//        DbContextHolder.setDbType(DBTypeEnum.shiro);
        SysUser user = new SysUser();
//        System.err.println("删除所有：" + user.delete(null));
        user.setUsername("alice");
        user.setPassword("123");
//        user.setId(UUID.randomUUID().toString());
        user.insert();
        System.err.println("查询插入结果：" + user.selectById().getUsername());
        user.setUsername("mybatis-plus-ar");
        System.err.println("更新：" + user.updateById());
        return user.selectPage(new Page<>(0, 12), null);
    }
}
