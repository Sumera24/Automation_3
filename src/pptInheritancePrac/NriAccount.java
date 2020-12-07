package pptInheritancePrac;

public class NriAccount extends BankAccount {

public void applyFixedDeposit() {
	BankAccount obj=new BankAccount();
	obj.interestRate =6.5f;
	System.out.println("NRI interest Rate: " +obj.interestRate );
	}
	
}
