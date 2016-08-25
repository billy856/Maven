package com.clps.user.action;

import com.clps.user.model.User;
import com.clps.user.service.UserService;
import com.opensymphony.xwork2.Action;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by jinyulei on 16/8/25.
 */
@Controller
public class UserAction implements Action {
    @Resource
    private UserService userService;

    public String execute() throws Exception {
        User user = new User();
        user.setUserName("jinyulei");
        System.out.println(userService);
        userService.addUser(user);
//        return "check";
        return SUCCESS;
    }
}
