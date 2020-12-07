package overridingPrac;

public class Cars /*extends Abstraction*/ {
	int x=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
System.out.println("This is Cars class");
 Cars obj=new Cars();
 obj.color();
 obj.make();
 obj.speed();

	}
	
	
	public Cars() {
		System.out.println("This is Cars Constructer");
	}
	public void color() {
		System.out.println("Green");
		System.out.println("This is Overridden method");
	}
	public void speed() {
		int mph=100;
		System.out.println(mph);
	}
	public void make() {
		String str="BMW";
		System.out.println(str);
		
	}

	/*@Override
	public void addition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		
	} */

}
