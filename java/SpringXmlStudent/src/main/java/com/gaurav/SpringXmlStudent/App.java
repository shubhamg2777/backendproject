package com.gaurav.SpringXmlStudent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    
	public static void main( String[] args )
    {
               ClassPathXmlApplicationContext classPathXmlApplicationContext= new ClassPathXmlApplicationContext("spring-web.xml");
  
               Student student=classPathXmlApplicationContext.getBean(Student.class);
               
               student.studentDetails();
               System.out.println(student);
    }
}
