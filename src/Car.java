
public class Car extends Vehicle {
	String type;
	int entertainmentSystem;
	public Car(String brand, String name, String licenseNumber, int topSpeed, int gasCap, int wheel, String type, int entertainmentSystem) {
		super(brand, name, licenseNumber, topSpeed, gasCap, wheel);
		this.type = type;
		this.entertainmentSystem = entertainmentSystem;
	}

	@Override
	void specificInfo() {
		System.out.println("Type: " + type);
		System.out.println("Entertainment System: " + entertainmentSystem);
		System.out.println("Turning on entertainment system...");
		
		if(type.equals("Supercar")) {
			System.out.println("Boosting!");
		}
		System.out.println("\n");
	}

}
