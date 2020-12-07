package variables;

public class VarPractice1 {
 static int i=20;
static String str="Sumera Qazi";
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Static Variable can be accessed directly in Static as well as in Non-Static Methods
	
	System.out.println("This is main method");
	System.out.println(i);
	System.out.println(str);
	
	VarPractice1 obj= new VarPractice1();
	obj.prac();
	
		//Non-Static Variable cannot be accessed directly in Static method
	
   	}
//Static Variable can be accessed directly in Static as well as in Non-Static Methods
	public void prac() {
		System.out.println("This is prac method");
		System.out.println(i);
		System.out.println(str);
	}

}
