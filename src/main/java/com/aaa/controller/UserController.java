package com.aaa.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 钱浩洋
 * @date 2020/2/19 - 16:59
 */
@Controller
public class UserController {
    @RequestMapping("login")
    public String login(String name, String password, Model model){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(name,password);
        try {
            subject.login(token);
            //说明登陆成功，我们跳转到test.html
            return "redirect:/";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg","没有这样的用户!");
            return "login";
        }catch (IncorrectCredentialsException e){
            model.addAttribute("msg","密码不正确");
            return "login";
        }

    }

}
