package org.studyeasy;

import graphics_card.GraphiscCard;
import laptop.LAPTOP;
import processor.Processor;

public class Hello {

	public static void main(String[] args) {
//		LAPTOP lappy = new LAPTOP();
//		System.out.println(lappy.getProcessor().getBrand());
		
		Processor processor = new Processor("intel", "7200u", 7, 4, 4, "6mb", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		GraphiscCard graphisccard = new GraphiscCard("nvadia", 1050, "4GB");
		LAPTOP gaminglaptop = new LAPTOP("17f", processor, "DDR4", "2TB", graphisccard, null, "backlet");
		System.out.println(gaminglaptop);
		
		gaminglaptop.gamingMode();
		System.out.println("Gaming mode on");
		System.out.println("Current Frequency = "+gaminglaptop.getProcessor().getFrequency());

	}

}