package oops.relation;

public class Car {
	private int id;
	private String color;
	private String brand;
	private Engine engine;
	
	public int getId() {
		return id;
	}
	public String getColor() {
		return color;
	}
	public String getBrand() {
		return brand;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public static void main(String[] args) {
		Car car = new Car();
		car.setId(100);
		car.setColor("RED");
		car.setBrand("BMW");
		
		
		Engine eng = new Engine();
		eng.setCc(2500);
		eng.setType("3000hp");
		
		car.engine = eng;
		System.out.println(car.getId());
		System.out.println(car.getColor());
		System.out.println(car.getBrand());
		System.out.println(car.engine.getCc());
		System.out.println(car.engine.getType());
		
		
	}
	

}
