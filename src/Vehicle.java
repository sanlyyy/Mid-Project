
public abstract class Vehicle {
	String brand;
	String name;
	String licenseNumber;
	int topSpeed;
	int gasCap;
	int wheel;
	
	public Vehicle(String brand, String name, String licenseNumber, int topSpeed, int gasCap, int wheel) {
		this.brand = brand;
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.topSpeed = topSpeed;
		this.gasCap = gasCap;
		this.wheel = wheel;
	}
	
	abstract void specificInfo();
	
	void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Name: " + name);
		System.out.println("License Plate: " + licenseNumber);
		System.out.println("Top Spped: " + topSpeed);
		System.out.println("Gas Capacity: " + gasCap);
		System.out.println("Wheel(s): " + wheel);
	}
}
