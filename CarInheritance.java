import java.util.Scanner;

public class CarInheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int mileage = sc.nextInt();

		Car result;
		if (input == 0)
			result = new WagonR(false, "4", mileage);
		else if (input == 1)
			result = new HondaCity(true, "4", mileage);
		else
			result = new InnovaCrysta(false, "6", mileage);

		String[] carNames = new String[3];
		carNames[0] = "WagonR";
		carNames[1] = "HondaCity";
		carNames[2] = "InnovaCrysta";

		String display = "A ";
		display += carNames[input];
		display += result.getIsSedan() ? " is Sedan, " : " is not Sedan, ";
		display += "is " + result.getSeats() + "-seater, ";
		display += "and has a mileage of around " + result.getMileage() + ".";

		System.out.println(display);
	}
}

abstract class Car {
	Boolean isSedan;
	String seats;

	public Car(Boolean isSedan, String seats) {
		this.isSedan = isSedan;
		this.seats = seats;
	}

	public Boolean getIsSedan() {
		return isSedan;
	}

	public String getSeats() {
		return seats;
	}

	abstract String getMileage();
}

class WagonR extends Car {
	public int mileage;

	public WagonR(Boolean isSedan, String seats, int mileage) {
		super(isSedan, seats);
		this.mileage = mileage;
	}

	@Override
	public String getMileage() {
		return mileage + " kmpl";
	}

}

class HondaCity extends Car {
	public int mileage;

	public HondaCity(Boolean isSedan, String seats, int mileage) {
		super(isSedan, seats);
		this.mileage = mileage;
	}

	public String getMileage() {
		return mileage + " kmpl";
	}
}

class InnovaCrysta extends Car {
	public int mileage;

	public InnovaCrysta(Boolean isSedan, String seats, int mileage) {
		super(isSedan, seats);
		this.mileage = mileage;
	}

	public String getMileage() {
		return mileage + " kmpl";
	}
}