package com.lin.clientmode.api;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author j on 2019/5/9
 */
@Controller
public class UserController {

    @RequestMapping("/user/userList")
    public ResponseEntity<List<UserInfo>> getAllUsers() {
        return ResponseEntity.ok(getUsers());
    }

    private List<UserInfo> getUsers() {
        List<UserInfo> users = new ArrayList<>();
        users.add(new UserInfo("er", "18","er@j.com"));
        users.add(new UserInfo("sha","19", "sha@j.com"));
        users.add(new UserInfo("zi","20", "zi@j.com"));

        return users;
    }

}
