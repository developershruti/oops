package org.studyeasy.vehicles;

import org.studyeasy.parent.vechicle;

public class bike extends vechicle{ // choosing bike object we must able to access vehicle constructor 
	private String handle;

	public bike() {
	   this.handle = "short"; // call vehicle default constructor
		
	}

	public bike(String handle,String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine,wheels,seats,fuelTank,lights); // here we can also pass the real value
		this.handle = "short";
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights()
				+ "]";
	}

	
	
}
