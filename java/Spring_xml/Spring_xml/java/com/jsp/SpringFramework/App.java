package com.jsp.SpringFramework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("new-spring-web.xml");
	}
	
}
