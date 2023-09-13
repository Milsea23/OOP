//this is a tutorial example for object-based programming (OOP) 
//September 12, 2023

public class Main {
//main method
	
	public static void main(String[]args) {
		Pen p = new Pen();
		Headphones h = new Headphones();
		//creates the objects for both the Pen and the Headphones
		
		System.out.println(p.colour);
		System.out.println(p.point);
		System.out.println(p.type);		
		System.out.println(p.clicked);
		//prints the status of all the Pen variables
		
		System.out.println();
		//prints a gap between the pen and the headphones
		
		System.out.println(h.charge);
		System.out.println(h.colour);
		System.out.println(h.power);
		System.out.println(h.volume);
		//prints the status of all the Headphones variables

	}
}
