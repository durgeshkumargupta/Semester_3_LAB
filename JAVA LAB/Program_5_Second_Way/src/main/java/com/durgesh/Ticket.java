package com.durgesh;

import java.io.Serializable;

public class Ticket implements Serializable
{
	private static final long serialVersionUID = -6931036513664758050L;
	private String ticketNumer;
	private double price;
	private String source;
	private String destination;
	private Customer customer;
	public String getTicketNumer() {
		return ticketNumer;
	}
	public void setTicketNumer(String ticketNumer) {
		this.ticketNumer = ticketNumer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Ticket [ticketNumer=" + ticketNumer + ", price=" + price + ", source=" + source + ", destination="
				+ destination + ", customer=" + customer + "]";
	}
	
}
