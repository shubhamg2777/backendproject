package com.jsp.OneToMany;

import java.util.ArrayList;
import java.util.List;
import com.jsp.OneToMany.Repository.Repository;
import com.jsp.OneToMany.entity.Application;
import com.jsp.OneToMany.entity.Mobile;

public class App {
	public static void main(String[] args) {
		// we are using mobile and application TABLE
		Mobile mobile = new Mobile();
		mobile.setBrand("Apple");
		mobile.setColour("BLACK");
		mobile.setPrice(80000);
		mobile.setRamSize("6GB");

		List<Application> applist = new ArrayList<Application>();
		
		Application application = new Application();
		application.setName("insta");
		application.setVersion("8.0");
		application.setType("app");
		
		Application application2 = new Application();
		application2.setName("facebook");
		application2.setType("app");
		application2.setVersion("7.5");
		
		Application application3 = new Application();
		application3.setName("Whatsapp");
		application3.setType("app");
		application3.setVersion("6");
		
		mobile.setApplicationList(applist);
		
		applist.add(application);
		applist.add(application2);
		applist.add(application3);

		Repository repository = new Repository();
		repository.saveMobileDetails(mobile);
	}
}
