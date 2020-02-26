package com.aaa.shiro;

import com.aaa.entity.User;
import com.aaa.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import javax.annotation.Resource;

/**
 * @author 钱浩洋
 * @date 2020/2/19 - 16:02
 */
public class UserRealm extends AuthorizingRealm {
    @Resource
    UserService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("执行授权");
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        //info.addStringPermission("user:add");
        Subject subject= SecurityUtils.getSubject();
        User user=(User) subject.getPrincipal();
        System.out.println("------------------------------"+user.getPic());
       // User byId = userService.findById(user.getId());

        info.addStringPermission(user.getPic());
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证");
       /* String name="1";
        String password="1";*/
        //编写shiro认证逻辑，判断用户名和密码        //判断用户名
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        User byName = userService.findByName(token.getUsername());
        if(byName == null){
            //说明用户名不存在！
            return null;
        }
        //判断密码
        return new SimpleAuthenticationInfo(byName,byName.getUserpwd(),"");    }
}
