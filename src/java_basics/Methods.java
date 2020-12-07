package java_basics;

public class Methods {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
// addition();
// profit(5000,1000);
		//profit(5000,4000,"January");
		//profit(5000,4000,"Febraury");
	//	profit(5000,4000,"March");
		//int profitOfCompanyreturn= profit(5000,4000,"April");
		//System.out.println(" is " + profitOfCompanyreturn);
		System.out.println(" is " +profit(5000,4000,"April"));
		
		
		//Methods value=new Methods();
		//value.substraction();
		
 
	}
	/*// Simple Method
	public static void addition() {
		
		int a=12;
		int b= 8;
		int sum=a+b;
		System.out.println(sum);
	} */
	
	
		/*//Method with Arguments	
	public static void profit(int income, int expense, String month) {
			int profit= income-expense;
			System.out.println("The profit of the company for month : "+month+" is "+ profit );
			
		}*/
	
	
	//Method with Return value
	public static int profit(int income, int expense,String month) {
		int profitOfCompany = income-expense;
		System.out.print("The profit of the company for month : "+month);
		return profitOfCompany;
	}
	
	/*public void substraction() {
		int a=50;
		int b=20;
		int difference= a-b;
		System.out.println("The difference is : "+difference);
	} */
	
		
	}


