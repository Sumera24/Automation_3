package java_basics;

public class ArithmaticOperations {

	public static void main(String[] args) {
		//Addition of integers//
		int a=256;
		int b= 8;
		int sum;
		sum=a+b;
		System.out.println("The sum of a and b is = "+sum);
		long x= 25567l;
		long y= 267856789;
		long z= y-x;
		System.out.println("The difference between x and y is = "+z);
		int mul = a*b;
		int division = a/b;
		int remainder = a%b;
		System.out.println("The product of a and b is = "+mul);
		System.out.println("The division of a and b is = "+division);
		System.out.println("The remainder of a and b is = "+remainder);
		
		/*Increament and Decrement Operator
		a++;
		b--;
		--x;
		++y;
		System.out.println("Value of a = " +a);
		System.out.println("Value of b = " +b);
		System.out.println("Value of x = " +x);
		System.out.println("Value of y = " +y); */
		
		int t= b++;
		//int t=++b;//
		System.out.println("value of t="+ t);
		System.out.println("value of b="+b);
		
		//Logical operators//
		//Condition Statements//
		
		
	}

}
