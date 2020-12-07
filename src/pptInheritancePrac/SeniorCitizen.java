package pptInheritancePrac;

public class SeniorCitizen extends BankAccount {

	public void applyFixedDeposit() {
		BankAccount obj=new BankAccount();
		obj.interestRate =10.5f;
		System.out.println("Senior Citizen interest Rate: " +obj.interestRate );
		
		
	}
	
}
