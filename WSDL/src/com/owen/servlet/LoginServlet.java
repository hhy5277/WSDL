package com.owen.servlet;

import com.owen.domain.User;

/**
 * 用户登录信息验证接口
 * @author OwenWilliam 2015-5-4
 *
 */
public interface LoginServlet
{
    String login(User user);
}
