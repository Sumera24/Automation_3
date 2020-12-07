package InheritancePrac;

public class Child extends Parent {
public int m=15;
public int n=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is Child Class");
		Child all=new Child();
		all.addition();
		all.subtraction();
		all.mul();
		all.div();
		
	}
	public void mul() {
		int pro= m*n;
		System.out.println(pro);
	}
	
	public void div() {
		int que= m/n;
		System.out.println(que);
	}

}
