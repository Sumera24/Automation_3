package java_basics;

public class PracticeConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeConstructors m= new PracticeConstructors();
		//PracticeConstructors m= new PracticeConstructors("Sumera Qazi");
		
		
		
	}
	public PracticeConstructors() {
		
		System.out.println("This is user defined Constructor.");
	}
	
public PracticeConstructors(String data) {
		
		System.out.println("This is second constructor where string is: "+ data);
}
}
