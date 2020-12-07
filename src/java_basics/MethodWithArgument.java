package java_basics;

public class MethodWithArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		profit(5000,4000,"January");
				profit(5000,4000,"Febraury");
				profit(5000,4000,"March");	

	}

	//Method with Arguments	
		public static void profit(int income, int expense, String month) {
				int profit= income-expense;
				System.out.println("The profit of the company for month :" +month + " is "+ profit );
				
			}
	
	
}
