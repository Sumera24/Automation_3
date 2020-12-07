package overridingPrac;

public class ExceptionPrac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// 1.Compile time Exception     2. Run time Exception
		
		int a=20;
		int b=0;
		 
		try {
			int div=a/b;	
			System.out.println(div);
		}
		catch ( Exception e) 
		{			
			System.out.println("We catched the error");
		}
		
	/*	try {
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println("we caught language error");
		}
		*/
		Thread.sleep(5000);
		

	}

}
