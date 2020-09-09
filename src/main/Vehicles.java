package main;


public class Vehicles {
	public Vehicles () {
		
	}
	
	public String Objective () {
		
		return "transport";
	}
	
	

}

class Car extends Vehicles {
	public void Make () {
		System.out.println("My favourite car make is Aston Martin ");
	}
	
}

class Motorbike extends Vehicles {
	String type = Objective();
	public void message() {
		System.out.println("It is the worst for "+ type);
	}
	
}

class Plane extends Vehicles {
	public String fly () {
		return "it can fly !!!!";
	}
	
}

