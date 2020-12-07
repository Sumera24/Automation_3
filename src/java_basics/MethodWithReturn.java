package java_basics;

public class MethodWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int profitOfCompanyreturn= profit(5000,4000,"April");
				//System.out.println(" is " + profitOfCompanyreturn);
				System.out.println(" is " +profit(5000,4000,"April"));
				

	}

	public static int profit(int income, int expense,String month) {
		int profitOfCompany = income-expense;
		System.out.print("The profit of the company for month : "+month);
		return profitOfCompany;
	}
	
	
}
