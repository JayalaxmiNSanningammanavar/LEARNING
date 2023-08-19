package _1_CalculatorDilemma;

import java.util.Scanner;

public class CalculatorDilemma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter first number");
 int a= scan.nextInt();

System.out.println("Enter second number");
 int b= scan.nextInt();

 Switch(a,b);

	}
	public  static void Switch(int a, int b)
			 {
		// TODO Auto-generated method stub
		
		
		{
		int result;
		Case1:
		     result = a+b;
		    System.out.println("Addition result is " +a + " + " +b + " = " + result);
	}
	{
		int c;
		Case2:
		c= a- b;
		System.out.println("Substraction result is " +a +" - "+b + " = " +  c);
	}
	{
		int d; 
		Case3:
	      d = a*b;
		System.out.println("Multiplication result is " +a +" * "+b +" = " + d);
	}
	{
		int e;
		Case4:
		e= a/b;
		System.out.println("Division result is " + a +" / "+b +" = "  +e);
			
	}
	

		
	}

}
	
