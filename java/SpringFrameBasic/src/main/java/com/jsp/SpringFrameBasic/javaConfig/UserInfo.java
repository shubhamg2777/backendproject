package com.jsp.SpringFrameBasic.javaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserInfo {
	
	@Value("admin@jsp.com")
	private String userName;
	
	@Value("AllowMeIn")
	private String password;
	
public UserInfo() {
	System.out.println(this.getClass().getSimpleName()+" object Created");
}

public String getDetails() {
return getUserName() + getPassword();
}


public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}

public UserInfo(String userName, String password) {
	this.userName = userName;
	this.password = password;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
// for representaion of object for to string use 
@Override
public String toString() {
	return "UserInfo [userName=" + userName + ", password=" + password + "]";
}

}
