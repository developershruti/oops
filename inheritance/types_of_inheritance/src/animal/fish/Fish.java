package animal.fish;

import animal.Animal;

public class Fish extends Animal {
   protected boolean waterbone = true;
   protected boolean gills = true;
public Fish() {
	animaltype = "fish";
	this.waterbone = true;
	this.gills = true;
}
 
public String showinfo() {
	return "Fish [waterbone=" + waterbone + ", gills=" + gills + ", heightinfeet=" + heightinfeet + ", weightinkilos="
			+ weightinkilos + ", animaltype=" + animaltype + ", bloodtype=" + bloodtype + "]";
}

   
   
}
