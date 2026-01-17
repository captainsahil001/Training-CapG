package oops.abstraction;

public class JuniorDeva extends Deva{
	
	@Override
	public void goldLoan() {
		System.out.println("Jr Deva Paid gold loan");
	}
	
	public void bike() {
		System.out.println("Bike only Jr Deva can ride");
	}
	
	 public static void main(String[] args) {
		JuniorDeva j = new JuniorDeva();
		j.homeLoan();
		j.goldLoan();
		j.bike();
		
		Parent p =new JuniorDeva();
		p.homeLoan();
		p.goldLoan();
//		p.bike();      CTE
		
		Deva d = new JuniorDeva();
		d.homeLoan();
		d.goldLoan();
//		d.bike();      CTE
		
	}

}
