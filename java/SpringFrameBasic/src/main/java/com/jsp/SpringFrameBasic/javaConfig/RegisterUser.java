package com.jsp.SpringFrameBasic.javaConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("singleton")
@Component
public class RegisterUser {
	@Autowired
	private UserInfo userInfo;

	public RegisterUser() {
		System.out.println(this.getClass().getSimpleName() + "  class Object created");
		System.out.println("User register");
	}
	//@PostConstruct
//public void getUser() {
//	String details = userInfo.getDetails();
//}
public UserInfo getUserInfo() {
	return userInfo;
}

public void setUserInfo(UserInfo userInfo) {
	this.userInfo = userInfo;
}

@Override
public String toString() {
	return "RegisterUser [userInfo=" + userInfo + "]";
}

}
