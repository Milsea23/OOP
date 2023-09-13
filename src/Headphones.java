
public class Headphones {
//main method for Headphones
	
	String charge = "Micro usb";
	String colour = "Red/black";
	//sets the Headphones variables
	
	static boolean power = false;
	static int volume = 0;
	//sets the "power" variable to false, and sets the "volume" variable to 0
	
	public static void powerOn() {
		power = true;
		//sets the "power" variable to true
		
	}
	
	public static void powerOff() {
		power = false;
		//sets the "power" variable to false

	}
	
	public static void volumeUp() {
		volume++;
		//increases the "volume" variable by 1
		
	}
	
	public static void volumeDown() {
		volume--;
		//decreases the "volume" variable by 1
		
	}
}

