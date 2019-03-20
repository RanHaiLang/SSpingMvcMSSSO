package com.rminfo.dao;

import com.rminfo.model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SeaRan
 * Date: 2019/3/4
 * Time: 16:02
 * 项目名：ssmSSO
 * 描述：TODO
 * Description: No Description
 */
public interface UserMpper {

    List<User> getAll();

    void save(User user);

    void delete(int id);

    void update(User user);

    User getUserById(int id);

    User login(User user);
}
