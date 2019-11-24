package com.testcenter.mall;

import com.testcenter.mall.dao.UserDao;
import com.testcenter.mall.model.UserDO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * @Program: mall
 * @Description：
 * @Author: huaxin
 * @Aate: 2019/10/27
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDOTest {

    @Autowired
    private UserDao userDao;

    @Before
    public void setUserDao() {
        UserDO userDO = new UserDO();
        userDO.setId(1L);
        userDO.setName("傅全有");
        userDO.setAccount("fuquanyou");
        userDO.setPwd("123322");
        userDao.save(userDO);

        userDO = new UserDO();
        userDO.setId(3L);
        userDO.setName("东方不败");
        userDO.setAccount("bubai");
        userDO.setPwd("123456");
        userDao.save(userDO);

        userDO.setId(5L);
        userDO.setName("向问天");
        userDO.setAccount("wentian");
        userDO.setPwd("123456");
        userDao.save(userDO);
    }


    @Test
    public void testAdd() {
        UserDO user = new UserDO();
        user.setId(2L);
        user.setName("springboot");
        user.setPwd("330781fang");
        user.setAccount("springboot");
        userDao.save(user);
    }


    @Test
    public void testLocate() {
        Optional<UserDO> user = userDao.findById(1L);
        if (user.isPresent()) {
            UserDO getUserInfo = user.get();
            System.out.println(String.format("userName:%s <=> password:%s", getUserInfo.getName(), getUserInfo.getPwd()));
        }
    }


    @Test
    public void testFindAll() {
        List<UserDO> account = userDao.findAll(Sort.by(Sort.Direction.DESC, "account"));
        for (UserDO item : account) {
            System.out.println(String.format("name=%s <=> password=%s",item.getName(),item.getPwd()));
        }
    }


    @After
    public void after() {
        userDao.deleteById(1L);
        userDao.deleteById(3L);
    }
}
