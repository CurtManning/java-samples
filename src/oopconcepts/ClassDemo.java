package oopconcepts;

public class ClassDemo {

	public static void main(String[] args) {
		Car bmw = new Car(); // Create and initialize the object
		bmw.setMake("BMW");
		System.out.println("Make of BMW is: " + bmw.getMake());
		// this is what happens when you don't set a value
		System.out.println("Model of BMW is: " + bmw.getModel());
		Car benz = new Car();
		benz.setModel("c300");
		System.out.println("Model of BENZ is: " + benz.getModel());
		
		benz.setYear(1899);
		System.out.println("Year of BENZ is: " + benz.getYear());
		
		benz.setYear(2020);
		System.out.println("Year of BENZ is: " + benz.getYear());
		benz.setYear(1888);
		System.out.println("Year of BENZ is: " + benz.getYear());
		
		benz.setMake("Benz");
		System.out.println("Make of BENZ is: " + benz.getMake());
	}
	
}