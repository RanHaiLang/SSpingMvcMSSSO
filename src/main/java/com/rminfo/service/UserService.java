package com.rminfo.service;

import com.rminfo.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: SeaRan
 * Date: 2019/3/4
 * Time: 15:58
 * 项目名：ssmSSO
 * 描述：TODO
 * Description: No Description
 */

@Transactional
public interface UserService {

    List getAll();

    void save(User user);

    void delete(int id);

    void update(User user);

    User getUserById(int id);

    User login(String username,String password);
}
