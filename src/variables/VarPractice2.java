package variables;

public class VarPractice2 {
static int i = 100;
String str="Sumera Qazi";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is Main Method ");
		VarPractice2 obj= new VarPractice2();
		
		//Non-Static Variable cannot be accessed directly in Static Methods
		System.out.println(obj.str);
		obj.display();
		
	
	}
	
	//Non-Static Variable can be accessed directly in Non-Static Methods
	public void display() {
		System.out.println(str);
	}
		
}
