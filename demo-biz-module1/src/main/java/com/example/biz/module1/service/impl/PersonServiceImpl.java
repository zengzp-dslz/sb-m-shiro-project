package com.example.biz.module1.service.impl;

import com.example.biz.module1.entity.Person;
import com.example.biz.module1.mapper.PersonMapper;
import com.example.biz.module1.service.PersonService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huitu123
 * @since 2018-01-23
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {

}
