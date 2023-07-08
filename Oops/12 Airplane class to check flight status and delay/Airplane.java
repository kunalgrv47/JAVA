package exercise12;

import java.time.LocalTime;

public class Airplane {
	
	private String flightNumber;
	private String destination;
	private LocalTime scheduledDeparture;
	private int delayTime;
	
	public Airplane(String flightNumber, String destination, LocalTime scheduledDeparture) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.scheduledDeparture = scheduledDeparture;
	}
	
	//Getters and Setters for Flight Number
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	//Getters and Setters for destination
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	//Getters and setters for scheduled departure
	public LocalTime getScheduledDeparture() {
		return scheduledDeparture;
	}
	public void setScheduledDeparture(LocalTime scheduledDeparture) {
		this.scheduledDeparture = scheduledDeparture;
	}
	
	//Getter  for DelayTime
	public int getDelayTime() {
		return delayTime;
	}
	
	//Setter for DelayTime (or) Function to create Delay
	public void delay(int minutes) {
		this.delayTime = minutes;
		this.scheduledDeparture = scheduledDeparture.plusMinutes(minutes);
	}
	
	//Function to check Flight Status
	public void checkStatus() {
		if(this.delayTime == 0) {
			System.out.println("Flight "+flightNumber + " is on time");
		}else {
			System.out.println("Flight "+flightNumber + " is delayed by "+ delayTime + " minutes");
		}
	}
	

}
