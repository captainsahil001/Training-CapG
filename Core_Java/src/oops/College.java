package oops;

public class College {
	String colName;
	String location;
	private void exam() {
		System.out.println(colName +" takes exam.");
	}
	private void print() {
		System.out.println(colName);
		System.out.println(location);
		exam();
	}
	public static void main(String[] args) {
		College c1 = new College();
		College c2 = new College();
		c1.colName = "IEM";
		c1.location = "Kolkata";
		c1.exam();
		c2.colName = "KIITS";
		c2.location = "Bhubaneswar";
		c2.print();
	}

}
