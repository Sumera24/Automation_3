package java_basics;

public class ConditionStatements {

	public static void main(String[] args) {
		int k= 15;
		int i= 10;
		int j= 10;
		// If Statement
		/*if (i>=10|| j>=20)
			System.out.println("Success");
		System.out.println("Main");*/
		/*
		if (i>=10 && j>20)
			System.out.println("Success");
		
		System.out.println("Main"); */
	// If - else statement//	
		/*if (i>=10 && j>20)
			{System.out.println("Success");
		
			}
		else
		System.out.println("Main"); */
		
		// if - else ladder
		 /*int marks= 60;
		 if(marks>=90 && marks<=100)
		 { System.out.println("Grade A");
		 
		 }
		 else if(marks>=80 && marks <90)
		 {
		 System.out.println("Grade B");
		 }
		 else if (marks>=70 && marks<80)
		 {
			 System.out.println("Grade C");
		 }
		 
		 else if(marks>=60 && marks<70)
		 {
			 System.out.println("Grade D");
		 }
		 else 
		 {
			 System.out.println("Poor Grades.. Need to work hard!");
		 }
		*/
		 
		 // Nested If else//
		 
		/* if (i>j)
		 {
		  if(i>k)
		 {
	System.out.println("i is largest");
		 }
		  else 
		  {
			  System.out.println("k is largest");
		  }
		 }
		  else if (j>k)
		  {
			System.out.println("j is largest");  
		  }
		 */
		 
		
		if(i>j && i>k)
		{
			System.out.println("i is Greatest");
		} 
		else if (j>k)
		{
			System.out.println("j is Greatest");
		}
		else
		{
			System.out.println("k is Greatest");
		}
		 
		 }
		 
		 
		 
		 
	}
	


