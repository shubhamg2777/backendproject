package com.jsp.OneToOne;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jsp.OneToOne.Repositry.AssociateRepository;
import com.jsp.OneToOne.entity.AdharDetails;
import com.jsp.OneToOne.entity.Person;

public class App {

	public static void main(String[] args) {

		// we are using table person and adhar Details
		Person person = new Person();
		person.setName("Himanshu Singh ");
		person.setAge(28);
		person.setContactNumber("700o966954");
		person.setDateOfBirth(new Date());
		person.setGender("Male");
		person.setEmail("himanshu277@gmail.com");

		AdharDetails adharDetails = new AdharDetails();
		adharDetails.setAdharNumber("8849820947");
		adharDetails.setCity("kanpur");
		adharDetails.setCountry("India");
		adharDetails.setState("UP");

		person.setAdharDetails(adharDetails);

		AssociateRepository associateRepository = new AssociateRepository();
		associateRepository.savePersonDetails(person);

	}
}