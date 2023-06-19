package com.gaurav.Spring_xml.javaConfig;

import org.springframework.stereotype.Component;

@Component
public class Music {
	
	public Music()
	{
		System.out.println(this.getClass().getSimpleName()+"  class Object created");
		System.out.println("Music");
	}

	
	
	
	

}
