package com.owen.servlet.impl;

import com.owen.domain.User;
import com.owen.servlet.LoginServlet;

/**
 * 用户登录信息验证
 * @author OwenWilliam 2015-5-4
 *
 */
public class LoginServletImpl implements LoginServlet
{

	@Override
	public String login(User user)
	{
		if ("owen".equals(user.getName()) && "1234".equals(user.getPassword()))
		{
			return "login successfully.";
		}
		return "login failed";
		
	}

}
