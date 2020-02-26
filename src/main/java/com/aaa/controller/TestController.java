package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 钱浩洋
 * @date 2020/2/19 - 16:31
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("add")
    public String add(){
        return "user/add";
    }
    @RequestMapping("update")
    public String update(){
        return "user/update";
    }
    @RequestMapping("toLogin")
    public String login(){
        return "login";
    }
    @RequestMapping("unAuth")
    public String unAuth(){
        return "unauth";
    }
}
