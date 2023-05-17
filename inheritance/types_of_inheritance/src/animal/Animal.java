package animal;

public class Animal {
  protected float heightinfeet;
  protected float weightinkilos;
  protected String animaltype;
  protected String bloodtype;
  
public Animal() {
	this.heightinfeet = 0;
	this.weightinkilos = 0;
	this.animaltype = "unknown";
	this.bloodtype = "unknown";
}

public String showinfo() {
	return "Animal [heightinfeet=" + heightinfeet + ", weightinkilos=" + weightinkilos + ", animaltype=" + animaltype
			+ ", bloodtype=" + bloodtype + "]";
}


  
  
	
}
