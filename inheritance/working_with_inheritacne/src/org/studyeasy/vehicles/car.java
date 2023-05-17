package org.studyeasy.vehicles;

import org.studyeasy.parent.vechicle;

public class car extends vechicle {
 
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;
	
	public car() {
		super();
		this.steering = "360";
		this.musicSystem = "off";
		this.airConditioner= "off";
		this.fridge = "off";
		this.entertainmentSystem = "off";
		
	}
	public car(String steering, String musicSystem, String airConditioner, String fridge , String entertainmentSystem
			,String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine, wheels, seats, fuelTank, lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner= airConditioner;
		this.fridge = fridge;
		this.entertainmentSystem = entertainmentSystem;
	
	}
	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public String getFridge() {
		return fridge;
	}
	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}
	@Override
	public String toString() {
		return "car [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getFridge()=" + getFridge()
				+ ", getEntertainmentSystem()=" + getEntertainmentSystem() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank()
				+ ", getLights()=" + getLights() + "]";
	}
	
   public void run() {
	   System.out.println("car running");
	   System.out.println(toString());
   }
	
	
	
}
