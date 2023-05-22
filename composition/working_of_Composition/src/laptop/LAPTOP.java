package laptop;

import graphics_card.GraphiscCard;
import processor.Processor;

public class LAPTOP {
	private String screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphiscCard graphicscard;
	private String opticalDrive;
	private String keyboard;
	public LAPTOP() {
		this.screen = "15.6f";
		this.processor = new Processor();  // anonymous object name less object
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.graphicscard = new GraphiscCard();
		this.opticalDrive = "MLT layer";
		this.keyboard = "backlit";
	}
	public LAPTOP(String screen, Processor processor, String ram, String hardDrive, GraphiscCard graphicscard,
			String opticalDrive, String keyboard) {
		
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicscard = graphicscard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}
	@Override
	public String toString() {
		return "LAPTOP [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicscard=" + graphicscard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}
	public Processor getProcessor() {
		return processor;
	}

	public String gamingMode() {
		processor.setFrequency(processor.getMaxfrequency());
		return "sucessfull";
	}
	
	
}
