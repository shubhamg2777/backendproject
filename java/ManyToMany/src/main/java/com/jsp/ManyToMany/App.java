package com.jsp.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import com.jsp.ManyToMany.entity.Bus;
import com.jsp.ManyToMany.entity.Passenger;
import com.jsp.Repository.Repository;

public class App {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.setBusName("ARADHYA TRAVELS");
		bus.setType("Electric Bus");

		Bus bus1 = new Bus();
		bus1.setBusName("Laxmi Travels");
		bus1.setType("Diesel Bus");

		Bus bus2 = new Bus();
		bus2.setBusName("Jay Maa");
		bus2.setType("Petrol Bus");

		Bus bus3 = new Bus();
		bus3.setBusName("Raj Travels");
		bus3.setType("Electric Bus");

		List<Bus> busList = new ArrayList<Bus>();
		busList.add(bus);
		busList.add(bus1);
		busList.add(bus2);
		busList.add(bus3);

		Passenger passenger = new Passenger();
		passenger.setName("Shubham");
		passenger.setAge(26);
		passenger.setBuses(busList);

		Passenger passenger1 = new Passenger();
		passenger1.setName("Rohit");
		passenger1.setAge(25);
		passenger1.setBuses(busList);

		Passenger passenger2 = new Passenger();
		passenger2.setName("Shyamu");
		passenger2.setAge(20);
		passenger2.setBuses(busList);

		List<Passenger> pList = new ArrayList<Passenger>();

		pList.add(passenger);
		pList.add(passenger1);
		pList.add(passenger2);

		bus.setPassenger(pList);
		bus1.setPassenger(pList);
		bus2.setPassenger(pList);

		Repository repository = new Repository();
		repository.saveBus(bus);
		repository.saveBus(bus1);
		repository.saveBus(bus2);
		repository.saveBus(bus3);
	}
}
