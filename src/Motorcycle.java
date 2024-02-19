
public class Motorcycle extends Vehicle {
	String type;
	int helm;
	int price;
	public Motorcycle(String brand, String name, String licenseNumber, int topSpeed, int gasCap, int wheel, String type, int helm, int price) {
		super(brand, name, licenseNumber, topSpeed, gasCap, wheel);
		this.type = type;
		this.helm = helm;
		this.price = price;
	}

	@Override
	void specificInfo() {
		// TODO Auto-generated method stub
		System.out.println("Type: " + type);
		System.out.println("Helm: " + helm);
		System.out.println(name + " is standing!");
		System.out.println("Price: " + price);
		System.out.println("\n");
	}

}
