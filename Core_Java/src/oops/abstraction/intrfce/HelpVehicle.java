package oops.abstraction.intrfce;

public class HelpVehicle {
	public static Vehicle getVehicle() {
		return new Bike();
	}
}
