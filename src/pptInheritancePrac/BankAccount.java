package pptInheritancePrac;

public class BankAccount {
 int withdrawMoney=1000;
 int depositAmount= 5000;
 float interestRate=9.5f;
 int balance;
	public void depositMoney() {
		System.out.println("Deposit Money :" + withdrawMoney);
	}
		
		public void withdrawMoney() {
			balance= depositAmount-withdrawMoney;
			System.out.println("The Balance is: " + balance);
		}
		
	
	
}
