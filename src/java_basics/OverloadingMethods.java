package java_basics;

public class OverloadingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingMethods values= new OverloadingMethods();
		values.multiplication();
		values.multiplication(200, 10);				
		System.out.println("This is the result of third method : "+values.multiplication(10, 5, 20));
				
		
	}
	
	public void multiplication() {
		int a=10;
		int b=5;
		int m= a*b;
		System.out.println("This is First Method. The product of two numbers is: " +m );
	}
	
	public void multiplication(int a, int b) {
		int m= a*b;
		System.out.println("This is Second Method. The product of two numbers is: " +m );
		}
	
	
	public int multiplication(int c, int d, int e) {
		int m=c*d*e;
		return m;
		
	}
	
	

}
