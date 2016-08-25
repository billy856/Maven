package com.clps.user.dao.impl;

import com.clps.user.dao.UserDAO;
import com.clps.user.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by jinyulei on 16/8/25.
 */
@Repository
public class UserDAOImpl implements UserDAO {
    public boolean saveUser(User user) {
        System.out.println(user.getUserName());
        return true;
    }
}
