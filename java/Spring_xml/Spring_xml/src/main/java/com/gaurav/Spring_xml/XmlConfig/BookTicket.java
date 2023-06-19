package com.gaurav.Spring_xml.XmlConfig;

public class BookTicket {

	private String ticketNumber;

	private String from;

	private String to;

	public BookTicket(String ticketNumber, String from, String to) {
		super();
		this.ticketNumber = ticketNumber;
		this.from = from;
		this.to = to;
	}

	public BookTicket() {
		System.out.println(this.getClass().getSimpleName() + "Class object is creaated");
	}

	public void bookingConfirmed() {
		System.out.println("Ticket is Booked !!!!!");
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "BookTicket [ticketNumber=" + ticketNumber + ", from=" + from + ", to=" + to + "]";
	}

}
