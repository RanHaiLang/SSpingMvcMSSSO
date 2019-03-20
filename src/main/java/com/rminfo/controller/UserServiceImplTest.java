package com.rminfo.controller;

import com.rminfo.model.User;
import com.rminfo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SeaRan
 * Date: 2019/3/4
 * Time: 16:51
 * 项目名：ssmSSO
 * 描述：TODO
 * Description: No Description
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring-*.xml")
public class UserServiceImplTest {

    @Resource
    Date date;
    @Resource
    UserService userService;

    @Test
    public void testDate() {
        System.out.println(date);
    }

    @Test
    public void testGetAll() {
        List<User> list = userService.getAll();
        for (User user : list) {
            System.out.println(user.getName());
        }
    }

    @Test
    public void testGetUserById() {
        System.out.println(userService.getUserById(1).getName());
    }

    @Test
    public void testSave() {
        User user = new User();
        user.setName("test");
        user.setAge(11);
        user.setPassword("pass");
        userService.save(user);
    }

    @Test
    public void testDelete() {
        userService.delete(1);
    }

    @Test
    public void testUpdate() {
        User user = userService.getUserById(2);
        user.setName("hello");
        userService.update(user);
    }
}
