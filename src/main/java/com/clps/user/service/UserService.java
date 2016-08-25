package com.clps.user.service;

import com.clps.user.dao.UserDAO;
import com.clps.user.dao.impl.UserDAOImpl;
import com.clps.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by jinyulei on 16/8/25.
 */
@Service
public class UserService {
    @Resource
    private UserDAO userDAO;

    public boolean addUser(User user) {
        userDAO.saveUser(user);
        return true;
    }
}
