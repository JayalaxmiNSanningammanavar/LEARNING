package _4BitwiseSwapper;

import java.util.Scanner;

public class BitwiseSwapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the first integer:\n ");
int a=scan.nextInt();
System.out.println("Enter the second integer:\n");
int b=scan.nextInt();
swapUsingBitwise(a,b);
	}
	public static void swapUsingBitwise(int a,int b)
	{
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping:" + "First" +" = " +a +"," +"Second = " +b );
	}

}
