package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserMySQLImpl;
import com.kuang.dao.UserOracleImpl;

/**
 * Description:
 *
 * @author wenjie
 * @date Create on 2020/11/14
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;
//    private UserDao userDao = new UserMySQLImpl();
//    private UserDao userDao = new UserOracleImpl();

//    public void getUser() {
//        userDao.getUser();
//    }

    // 利用set进行动态实现值得注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUserDao() {
        userDao.getUser();
    }
}
