package InheritancePrac;

public class Parent {
	public static int x=70;
	public static int y=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is Parent Class");
		Parent call=new Parent();
		call.addition();
		call.subtraction();

	}
	
	public  void addition() {
		int sum=x+y;
		System.out.println(sum);
	}
	
	public  void subtraction() {
		
		int diff= x-y;
		System.out.println(diff);
		
	

	}

}
