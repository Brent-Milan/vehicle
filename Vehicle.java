package vehicle;

public abstract class Vehicle {

	protected String name;
	protected String make;
	protected String model;
	protected String methodOfTravel;
	protected int kmh;
	protected  int passengerCount;
	
	
	public Vehicle() {
		
	}
	
	public int calcDistance(Vehicle a, int tripDuration){
		return (kmh * tripDuration);
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
	
	
	public int drive(Vehicle vehicle, int hours){
		int result = vehicle.calcDistance(vehicle, hours);
		System.out.println("The " + vehicle + " traveled " + result + " km/h in " +  hours + " " + methodOfTravel);
		return result;
	}
	
	public int driveIn(Vehicle vehicle, int distance) {
		int result = (distance / vehicle.kmh);
		System.out.println("The " + vehicle + " will travel " + distance + " kilometers in " + result + " hours.");
		return result;
	}
}
