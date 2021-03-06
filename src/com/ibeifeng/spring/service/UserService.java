package com.ibeifeng.spring.service;

import com.ibeifeng.spring.dao.IUserDao;
import com.ibeifeng.spring.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhm on 2017/2/16.
 */
@Service
public class UserService implements IUserService {
    private IUserDao userDao;
    @Override
    public void save(User user) {
        userDao.add(user);
    }

    @Resource
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
