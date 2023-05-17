package animal.fish;

public class Eel extends Fish {
	private String special;

	public Eel() {
		super();
		this.special = "Release electric stock";
	}

	
	public String showinfo() {
		return "Eel [special=" + special + ", waterbone=" + waterbone + ", gills=" + gills + ", heightinfeet="
				+ heightinfeet + ", weightinkilos=" + weightinkilos + ", animaltype=" + animaltype + ", bloodtype="
				+ bloodtype + "]";
	}
}
