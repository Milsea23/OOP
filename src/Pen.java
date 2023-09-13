
public class Pen {
//main method for Pen
	
	String type = "gel";
	String colour = "blue";
	int point = 10;
	//sets the Pen variables
	
	static boolean clicked = false;
	//sets the "clicked" variable to false

	public static void click() {
		clicked = true;
		//sets the "clicked" variable to true
		
	}
	
	public static void unclick() {
		clicked = false;
		//sets the "clicked" variable to false
		
	}

}
