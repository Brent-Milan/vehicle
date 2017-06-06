package vehicle;

public class VehicleClassApp {

	public static void main(String[] args) {
		Car car = new Car();  // only necessary because Vehicle is abstract. 
		Plane plane = new Plane(); // could refactor to change and call from 'Vehicle'
		
		Tesla m = new Tesla(100, 4);
		Boeing jet = new Boeing(400, 15);
		
		
		// 10 hour travel time; return distance traveled
		car.drive(m, 10);
		plane.drive(jet, 10);
		
		//travel 500 miles
		
		car.driveIn(m, 100);
		plane.driveIn(jet, 100);
		
		
		
	}

}
