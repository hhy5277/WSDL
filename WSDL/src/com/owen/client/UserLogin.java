package com.owen.client;

import com.owen.domain.User;
import com.owen.servlet.impl.LoginServletImpl;

/**
 * 用户登录的对外接口
 * @author OwenWilliam 2015-5-4
 *
 */
public class UserLogin
{
    private LoginServletImpl lsi = new LoginServletImpl();
    
    public String userlogin(String name, String password)
    {
    	User user = new User(name, password);
    	return lsi.login(user);
    }
}
