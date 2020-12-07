package pptInheritancePrac;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NriAccount obj1= new NriAccount();
		SeniorCitizen obj2= new  SeniorCitizen();
		BankAccount obj3=  new BankAccount();
		obj3.depositMoney();
		obj3.withdrawMoney();
		obj1.applyFixedDeposit();
		obj2.applyFixedDeposit();
		
	}

}
