package processor;

public class Processor {
	private String brand; 
	private String series;
	private int generations;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String Maxfrequency;
	private String Minfrequency;
	public Processor() {
		
		this.brand = "intel";
		this.series = "7200u";
		this.generations = 7;
		this.cores = 2;
		this.threads = 4;
		this.cacheMemory = "3MB";
		this.frequency = "2.5Gha";
		Maxfrequency = "2.5Gha";
		Minfrequency = "3.1Gha";
	}
	public Processor(String brand, String series, int generations, int cores, int threads, String cacheMemory,
			String frequency, String maxfrequency, String minfrequency) {
		
		this.brand = brand;
		this.series = series;
		this.generations = generations;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		Maxfrequency = maxfrequency;
		Minfrequency = minfrequency;
	}
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generations=" + generations + ", cores=" + cores
				+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
				+ ", Maxfrequency=" + Maxfrequency + ", Minfrequency=" + Minfrequency + "]";
	}
	public String getBrand() {
		return brand;
	}
	public String getSeries() {
		return series;
	}
	public int getGenerations() {
		return generations;
	}
	public int getCores() {
		return cores;
	}
	public int getThreads() {
		return threads;
	}
	public String getCacheMemory() {
		return cacheMemory;
	}
	public String getFrequency() {
		return frequency;
	}
	public String getMaxfrequency() {
		return Maxfrequency;
	}
	public String getMinfrequency() {
		return Minfrequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public void gamingMode() {
	  System.out.println("");
	}
	
}
