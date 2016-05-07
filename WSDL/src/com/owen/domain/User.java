package com.owen.domain;

/**
 * 实体用户
 * @author OwenWilliam 2015-5-4
 *
 */
public class User
{
	//用户名
    private String name;
    //用户密码
    private String password;
    /**
     * 有参构造器
     * @param name
     * @param password
     */
	public User(String name, String password)
	{
		this.name = name;
		this.password = password;
	}
	/**
	 * 无参构造器
	 */
	public User()
	{
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
    
	
    
}
