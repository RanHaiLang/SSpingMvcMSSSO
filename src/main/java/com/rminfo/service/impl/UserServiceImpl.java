package com.rminfo.service.impl;

import com.rminfo.dao.UserMpper;
import com.rminfo.model.User;
import com.rminfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SeaRan
 * Date: 2019/3/4
 * Time: 16:01
 * 项目名：ssmSSO
 * 描述：TODO
 * Description: No Description
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMpper userMapper;

    public List<User> getAll() {
        return userMapper.getAll();
    }

    public void save(User user) {
        userMapper.save(user);
    }

    public void delete(int id) {
        userMapper.delete(id);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User login(String username, String password) {
        User u = new User();
        u.setName(username);
        u.setPassword(password);
        return userMapper.login(u);
    }
}
