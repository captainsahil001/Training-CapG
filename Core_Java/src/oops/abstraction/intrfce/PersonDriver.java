package oops.abstraction.intrfce;

public class PersonDriver {
	public static void main(String[] args) {
		Person p =new Person();
		p.setV(new Car());
		p.setV(new Bike());
		Vehicle v2 = p.getV();
		v2.type();
		v2.price();
	}
}
