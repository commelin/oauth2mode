package com.lin.passwordmode.api;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author j on 2019/5/9
 */
@Controller
public class UserController {

	@CrossOrigin
    @RequestMapping("/user/userList")
    public ResponseEntity<UserInfo> getUerInfo() {
        User user = (User) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        String email = user.getUsername() + "@j.com";

        UserInfo userInfo = new UserInfo();
        userInfo.setName(user.getUsername());
        userInfo.setEmail(email);
        userInfo.setAge("18");

        return ResponseEntity.ok(userInfo);
    }

}