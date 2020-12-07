package java_basics;

public class VariablesPractice {

	static int i=20; //Static Variable Example
	// int i=20; //Instance Variable
	 //int a=50;//Instance Variable for local variable example
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is main block");
		
		//Static Variable Example
		System.out.println("Value of Static Variable i initially: " +i);
		int i=100;
		System.out.println("Value of Static Variable i after : "+ i);
		
		//Instance Variable Example
		
		/*VariablesPractice obj1= new VariablesPractice();
		VariablesPractice obj2= new VariablesPractice();
		VariablesPractice obj3= new VariablesPractice();
	
		
		System.out.println("Value of Static Variable i initially: " +obj1.i);
		System.out.println("Value of Static Variable i initially: " +obj2.i);
		System.out.println("Value of Static Variable i initially: " +obj3.i);
		
		obj2.i=100;
        System.out.println("Value of Static Variable i initially: " +obj1.i);
		System.out.println("Value of Static Variable i initially: " +obj2.i);
		System.out.println("Value of Static Variable i initially: " +obj3.i); */
		
		//Local Variable Example
		/* local();
		VariablesPractice obj= new VariablesPractice();
		System.out.println("This is main block value:" +obj.a);
		
				
	}

	public static void local() {
		int a= 500;
		System.out.println("This is method block value:" +a);		
		
	}*/
}
}
