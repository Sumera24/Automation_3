package java_basics;

public class MethodNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodNonStatic m= new MethodNonStatic();
		m.substraction();
		//System.out.println("The difference is : "+m.substraction());// Non static return type method
		
		
	}
	

	/*public void substraction() {
		int a=50;
		int b=20;
		int difference= a-b;
	
		System.out.println("The difference is : "+difference);
	}*/
		
		//Non static return type method
		public int substraction() {
			int a=40;
			int b=20;
			int difference= a-b;
			return difference;
			//System.out.println("The difference is : "+difference);
		}
	
}
