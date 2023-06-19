package com.jsp.ManyToOne;

import java.util.ArrayList;
import java.util.List;

import com.jsp.ManyToOne.entity.Shopping;
import com.jsp.ManyToOne.entity.User;
import com.jsp.ManyToOneRepository.Repository;

public class App {
	public static void main(String[] args) {
		List<Shopping> list = new ArrayList<Shopping>();

		Shopping shopping = new Shopping();
		shopping.setName("AMAZON");
		shopping.setSupportedOrType("IOS");
		shopping.setVersion("10");

		Shopping shopping1 = new Shopping();
		shopping1.setName("MYNTRA");
		shopping1.setSupportedOrType("ANDROID");
		shopping1.setVersion("12");

		Shopping shopping2 = new Shopping();
		shopping2.setName("SNAPDEAL");
		shopping2.setSupportedOrType("ANDROID");
		shopping2.setVersion("12");

		list.add(shopping);
		list.add(shopping1);
		list.add(shopping2);

		User user = new User();
		user.setUserName("Shubham");
		user.setEmail("shubhamg2777@gmail.com");
		user.setPassword("sh@234");

		Repository repository = new Repository();

		repository.saveUserDetails(user);

		repository.saveShoppingDetails(shopping);
		repository.saveShoppingDetails(shopping1);
		repository.saveShoppingDetails(shopping2);
	}
}
