package java_basics;

public class GettersSetters {
public int i=20;
private int x=40;
private int y=60;
private int z=80;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is Main Method");
		
		GettersSetters obj=new GettersSetters();
		obj.
		mul();
		System.out.println(obj.getX());
	System.out.println(obj.y);
				
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void mul() {
	GettersSetters ob=new GettersSetters();
	
		System.out.println(ob.i);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
