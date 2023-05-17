package org.studyeasy;
import org.studyeasy.vehicles.car;
import org.studyeasy.vehicles.bike;


public class demo {

	public static void main(String[] args) {
	    //bike bike = new bike("long","dazzle",4,4,45,"LED");
	  //  System.out.println(bike); // this single statement is enough for print  multiple statments by  overide tostring in bike class  
	   // bike.run();
	  // we don't use this multiple print statement we can use tostring method to print whole value in single statement
//	    System.out.println("Handle= "+bike.getHandle());
//	   System.out.println("Engine Type= "+bike.getEngine());
//	   System.out.println("Fuel Tank Capacity= "+bike.getFuelTank());
//	   System.out.println("Head Lamp Type= "+bike.getLights());
//	   System.out.println("Number of Seats= "+bike.getSeats());
//	   System.out.println("Number of Wheels= "+bike.getWheels());
	    
      car car = new car("circle","on","on","on","on","deisel",4,4,45,"LED");	
     // System.out.println(car.getSteering());
      
     // System.out.println(car);
       car.run();

	}

}
