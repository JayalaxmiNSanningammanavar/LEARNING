package _2TempratureConversion;

import java.util.Scanner;

public class TempratureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:");
		System.out.println("1.Convert Celsius to Fahrenhiet");
		System.out.println("2.Convert Fahrenhiet to Celsius");
		System.out.println("Enter your choice: ");
		int c=scan.nextInt();
		System.out.println("Enter the temprature in Celsius: ");
		double a=scan.nextDouble();
		TempratureConversion1 celsiusToFahrenheit=new TempratureConversion1();
		System.out.println( a+" C "+ "is equilant to" +celsiusToFahrenheit.celsiusToFahrenheit(a)+" C");
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:");
		System.out.println("1.Convert Celsius to Fahrenhiet");
		System.out.println("2.Convert Fahrenhiet to Celsius");
		System.out.println("Enter your choice: ");
		int c1=scan.nextInt();
		System.out.println("Enter the temprature in Fahrenhiet: ");
		double a1=scan.nextDouble();
		TempratureConversion2 fahrenheitToCelsius=new TempratureConversion2();
	    System.out.println(a1+" F " +"is equilant to" +fahrenheitToCelsius.fahrenheitToCelsius(a1)+" C");

	}
	

}