package overridingPrac;

public class Jeep extends Cars {
int x=200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  System.out.println("This is Jeep Class");
   Jeep obj=new Jeep();
   obj.make();
   obj.speed();
   obj.color();// this will call override method (Child Method)
   obj.model();
   obj.var();
   
   
   
 
	}
	
	public Jeep() {
		//super(); // for calling Parent Constructor
		System.out.println("This is Jeep Constructor");
	}
public void var() {
	System.out.println(super.x);// Call Parent Class Variable
	System.out.println(x);
}
	public void model() {
		int mdl=2006;
		System.out.println("mdl");
	}
	
	@Override // this will verify that user is using the same method that exists in the parent class
	public void color() {
		//super.color(); // this will call the overridden method (Parent Method) 
		System.out.println("This is Override method");
		System.out.println("Blue");
	}
		
}
