package org.maven;

import java.util.ResourceBundle;

public class Demo {
	
public int userLogin(String user_name,String Pass)
{
	ResourceBundle rb = ResourceBundle.getBundle("config");
	String userName = rb.getString("username");
	String password = rb.getString("password");
	
	if(user_name.equals(userName))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

}
