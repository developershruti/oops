package animal.reptile;

import animal.Animal;

public class Reptile extends Animal{
 protected String skin,egg;
 protected boolean backbone;
 
  public Reptile() {
	  
    heightinfeet = 5;
	weightinkilos = 20;
    animaltype = "Reptile";
    bloodtype = "cold";
   this.skin = "Dry skin";
   this.backbone = true;
   this.egg = "soft shelled";
 }


public String showinfo() {
	return "Reptile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightinfeet=" + heightinfeet
			+ ", weightinkilos=" + weightinkilos + ", animaltype=" + animaltype + ", bloodtype=" + bloodtype + "]";
}
 
 
 
}
