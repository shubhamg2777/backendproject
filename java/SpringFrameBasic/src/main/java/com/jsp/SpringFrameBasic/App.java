package com.jsp.SpringFrameBasic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.SpringFrameBasic.Config.AppConfiguration;
import com.jsp.SpringFrameBasic.javaConfig.RegisterUser;
import com.jsp.SpringFrameBasic.javaConfig.UserInfo;
import com.jsp.SpringFrameBasic.xml.BookTicket;
import com.jsp.SpringFrameBasic.xml.UserDetail;

public class App {
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext ctx = new
		// ClassPathXmlApplicationContext("spring-web.xml");
//		BookTicket ticket = ctx.getBean(BookTicket.class);
//		ticket.bookingConfirmed();
//		ticket.setTicketNumber("1");
//		ticket.setFrom("subodh");
//		ticket.setTo("Shubham");
		// System.out.println(ticket);

		// UserDetail user = ctx.getBean(UserDetail.class);
//		user.setId(1);
//		user.setName("Shubham");
//		user.setEmail("shubhamg2777@gmail.com");
		// System.out.println(user);

     		//   BY java configure : -

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfiguration.class);
		ctx.refresh();
   RegisterUser user = ctx.getBean(RegisterUser.class);
  System.out.println(user);
  ctx.getBean(RegisterUser.class);
  ctx.getBean(RegisterUser.class);
	
	}
}
