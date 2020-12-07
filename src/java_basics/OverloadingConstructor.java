package java_basics;

public class OverloadingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	OverloadingConstructor m= new OverloadingConstructor();// 1st constructor

	
		OverloadingConstructor n= new OverloadingConstructor("Sumera");// 2nd constructor
	
		OverloadingConstructor o= new OverloadingConstructor(2,20);// 3rd constructor
		System.out.println(m.OverloadingConstructor()); //4th Constructor, return by value constructor
		
		
		

	}
	
	public OverloadingConstructor() {		
		System.out.println("First Constructor");
	}

	
public OverloadingConstructor(String s) {
		
		System.out.println("Second Constructor with string : " +s);
	}

public OverloadingConstructor(int a, int b) {
	int sum= a+b;
	
	System.out.println("Third Constructor with sum of two numbers : "+sum);
}

//4th Constructor, return by value constructor
public int OverloadingConstructor() {
	int c=50;
	System.out.println("fourth Constructor");
	return c;
}
}
