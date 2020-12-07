package java_basics;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
	char day= 'Z';
	switch (day)
	{
	
	case 'A':
		System.out.println("Monday");
	break;
	case 'B':
		System.out.println("Tuesday");
	break;
	case 'C':
		System.out.println("Wednesday");
	break;
	case 'D':
		System.out.println("Thursday");
	break;
	case 'E':
		System.out.println("Friday");
	break;
	
	default: 
		System.out.println("This is Default Value");
		break;		
	
	} 
		
		/*Scanner myscan=new Scanner(System.in);
		
		
		int day;
		
		System.out.println("Enter day : ");
		day=myscan.nextInt();
		

		switch(day) {
		
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
		
		
		
		}*/
	
	}

}
