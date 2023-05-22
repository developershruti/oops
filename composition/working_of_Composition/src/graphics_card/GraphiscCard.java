package graphics_card;

public class GraphiscCard {
  private String brand;
  private int series;
  private String memory;
  
public GraphiscCard() {
	this.brand = "navadia";
	this.series = 940;
	this.memory = "2GB";
	
}
public GraphiscCard(String brand, int series, String memory) {
	
	this.brand = brand;
	this.series = series;
	this.memory = memory;
}
@Override
public String toString() {
	return "GraphiscCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
}
  
  
}
