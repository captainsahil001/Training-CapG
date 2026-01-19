package oops.abstraction.intrfce;

public class Pdriver {
	public static void main(String[] args) {
		Vehicle v = HelpVehicle.getVehicle();
		v.price();
		v.type();
	}

}
