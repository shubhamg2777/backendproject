package com.gaurav.Spring_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaurav.Spring_xml.XmlConfig.BookTicket;
import com.gaurav.Spring_xml.XmlConfig.Car;
import com.gaurav.Spring_xml.configuration.AppConfig;

/**
 * world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//    	ClassPathXmlApplicationContext  classPathXmlApplicationContext=new ClassPathXmlApplicationContext("spring-Web.xml");
//   
//    	BookTicket ticket=classPathXmlApplicationContext.getBean(BookTicket.class);
//    	ticket.bookingConfirmed();
//    	System.out.println(ticket);
//    	
//    	Car car=classPathXmlApplicationContext.getBean(Car.class);
//    	car.carDetails();
//    	System.out.println(car);
    	
    	AnnotationConfigApplicationContext ctx =new  AnnotationConfigApplicationContext();
    	ctx.register(AppConfig.class);
    	ctx.refresh();
    
    }
}
