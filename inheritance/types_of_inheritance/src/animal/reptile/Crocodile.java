package animal.reptile;

public class Crocodile extends Reptile{

	public Crocodile() {
		super();
		egg = "Hard shelled";
	}

	public String showinfo() {
		return "Crocodile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightinfeet=" + heightinfeet
				+ ", weightinkilos=" + weightinkilos + ", animaltype=" + animaltype + ", bloodtype=" + bloodtype + "]";
	}
 
	
}
