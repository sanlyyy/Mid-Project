import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	ArrayList<Vehicle> vehicles;
	
	public Main() {
		vehicles = new ArrayList<>();
	}
	
	public void inputMenu() {
		Scanner sc = new Scanner(System.in);
		boolean validInput = false;
		int option;
		
		do {
			System.out.print("Menu:\n" +
								"1. Input\n"
								+ "2. View\n"
								+ "3. Exit\n"
								+ ">> ");
			
			try {
				option = sc.nextInt();
			} catch (Exception e) {
				option = -1;
				System.out.println("Invalid option.");
				sc.nextLine();
			} finally {
				sc.nextLine();
			}
			
			switch (option) {
			case 1:
				do {
					System.out.println("\nEnter Vehicle Details:");
					System.out.print("Input type [Car | Motorcycle]: ");
					String vehicleType = sc.nextLine();
					if(vehicleType.equalsIgnoreCase("Car")) {
						Car mobil = inputCar(sc);
						if(mobil != null) {
							vehicles.add(mobil);
							validInput = true;
						} else {
							System.out.println("Invalid Input.");
						}
					}else if (vehicleType.equalsIgnoreCase("Motorcycle")) {
						Motorcycle motor = (Motorcycle) inputMotorcycle(sc);
						if(motor != null) {
							vehicles.add(motor);
							validInput = true;
						} else {
							System.out.println("Invalid Input.");
						}
					}
				} while (!validInput); break;
			case 2:
				viewMenu();
				break;
			case 3:
				System.out.println("Exiting Program..."); break;
				
			default:
				System.out.println("Invalid option.\n");
				break;
			}
		} while (option != 3);
	}

	private Object inputMotorcycle(Scanner sc) {
		String type;
		String brand;
		String name;
		String licenseNumber;
		int topSpeed;
		int gasCap;
		int wheel;
		int helm;
		int price;
		boolean validInput = false;
		
		do {
			System.out.println("Input brand [>= 5]: ");
			brand = sc.nextLine();
			if (brand.length() >= 5) {
				validInput = true;
			} else {
				System.out.println("Brand must be 5 characters or more.\n");
			}
		} while (!validInput);
		
		validInput = false;
		
		do {
			System.out.println("Input name [>=5]: ");
			name = sc.nextLine();
			if (name.length() >= 5) {
				validInput = true;
			} else {
				System.out.println("Name must be 5 characters or more.\n");
			}
		} while (!validInput);
		
		validInput = false;
		
		do {
			System.out.println("Input License: ");
			licenseNumber = sc.nextLine();
			if (licenseNumber.matches("^[A-Z] \\d{4} [A-Z]{3}$")) {
	            validInput = true;
	        } else {
	            System.out.println("Invalid license number format. Please follow the format: A 1234 XYZ.\n");
	        }
		} while (!validInput);
		
		validInput = false;
		
		do {
			System.out.println("Input top speed [100 <= topSpeed <= 250]: ");
			topSpeed = sc.nextInt();
			if (topSpeed >= 100 && topSpeed <= 250) {
	            validInput = true;
	        } else {
	            System.out.println("Top speed must be between 100 and 250.\n");
	        }
		} while (!validInput);
		
		validInput = false;
		
		do {
			System.out.println("Input gas capacity [30 <= gasCap <= 60]: ");
			gasCap = sc.nextInt();
			if (gasCap >= 30 && gasCap <= 60) {
				validInput = true;
			} else {
				System.out.println("Gas capacity must be between 30 and 60.\n");
			}
		} while (!validInput);
		
		validInput = false;
		
		do {
			System.out.println("Input wheel [2 <= wheel <= 3]: ");
			wheel = sc.nextInt();
			if (wheel >= 2 && wheel <= 3) {
				validInput = true;
			} else {
				System.out.println("Wheel must be between 2 and 3.\n");
			}
		} while (!validInput);
		
		validInput = false;
		
		do {
			System.out.println("Input type [Automatic | Manual]: ");
			type = sc.nextLine();
		} while (!type.matches("(?i)Automatic|Manual"));
		
		do {
			System.out.println("Input helm amount [>= 1]: ");
			helm = sc.nextInt();
			if (helm >= 1) {
				validInput = true;
			} else {
				System.out.println("Helm must be more than 0.\n");
			}
		} while (!validInput);
		
		validInput = false;
		
		do {
			System.out.println("Input price: ");
			price = sc.nextInt();
			if (price != 0) {
				validInput = true;
			} else {
				System.out.println("Price must be more than 0.\n");
			}
		} while (!validInput);
		
		System.out.println("ENTER to return\n");
		
		return new Motorcycle(brand, name, licenseNumber, topSpeed, gasCap, wheel, type, helm, price);
	}

	private Car inputCar(Scanner sc) {
		String type;
		String brand;
		String name;
		String licenseNumber;
		int topSpeed;
		int gasCap;
		int wheel;
		int entertainmentSystem = 0;
		boolean validInput = false;
		
		do {
			System.out.println("Input brand [>= 5]: ");
			brand = sc.nextLine();
			if (brand.length() >= 5) {
				validInput = true;
			} else {
				System.out.println("Brand must be 5 characters or more.\n");
			}
		} while(!validInput);
		
		validInput = false;
		
		do {
			System.out.println("Input name [>=5]: ");
			name = sc.nextLine();
			if (name.length() >= 5) {
				validInput = true;
			} else {
				System.out.println("Name must be 5 characters or more.\n");
			}
		} while(!validInput);
		
		validInput = false;
		
		do {
			System.out.println("Input License: ");
			licenseNumber = sc.nextLine();
			if (licenseNumber.matches("^[A-Z] \\d{4} [A-Z]{3}$")) {
	            validInput = true;
	        } else {
	            System.out.println("Invalid license number format. Please follow the format: A 1234 XYZ.\n");
	        }
		} while(!validInput);
		
		validInput = false;
		
		do {
			System.out.println("Input top speed [100 <= topSpeed <= 250]: ");
			topSpeed = sc.nextInt();
			if (topSpeed >= 100 && topSpeed <= 250) {
	            validInput = true;
	        } else {
	            System.out.println("Top speed must be between 100 and 250.\n");
	        }
		} while(!validInput);
		
		validInput = false;
		
		do {
			System.out.println("Input gas capacity [30 <= gasCap <= 60]: ");
			gasCap = sc.nextInt();
			if (gasCap >= 30 && gasCap <= 60) {
				validInput = true;
			} else {
				System.out.println("Gas capacity must be between 30 and 60.\n");
			}
		} while(!validInput);
		
		validInput = false;
		
		do {
			System.out.println("Input wheel [4 <= wheel <= 6]: ");
			wheel = sc.nextInt();
			if (wheel >= 4 && wheel <= 6) {
				validInput = true;
			} else {
				System.out.println("Wheel must be between 4 and 6.\n");
			}
		} while(!validInput);
		
		validInput = false;
		
		do {
			System.out.println("Input type [SUV | Supercar | Minivan]: ");
			type = sc.nextLine();
		} while (!type.matches("(?i)SUV|Supercar|Minivan"));
		
		do {
			System.out.println("Input entertainment system amount [>= 1]: ");
			entertainmentSystem = sc.nextInt();
			if (entertainmentSystem >= 1) {
				validInput = true;
				System.out.println("ENTER to return\n");
			} else {
				System.out.println("Entertainment system must be more than 0.\n");
			}
		} while(!validInput);
		
		return new Car(brand, name, licenseNumber, topSpeed, gasCap, wheel, type, entertainmentSystem);
	}
	
	private void viewMenu() {
		if(vehicles.isEmpty()) {
			System.out.println("No vehicles added yet.");
		} else {
			System.out.println("\nVehicle List: ");
			for(int i = 0; i < vehicles.size(); i++) {
				System.out.println("Vehicle " + (i+1) + ": ");
				vehicles.get(i).display();
				vehicles.get(i).specificInfo();
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Main menu = new Main();
		menu.inputMenu();
	}
}
