package com.example.biz.module1.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.example.biz.module1.entity.Person;
import com.example.biz.module1.service.PersonService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huitu123
 * @since 2018-01-23
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/findAll")
    @RequiresPermissions("userInfo:abc")
    public Page<Person> findAllPerson(){
        return personService.selectPage(new Page<>(1,99,"id"));
    }
}

