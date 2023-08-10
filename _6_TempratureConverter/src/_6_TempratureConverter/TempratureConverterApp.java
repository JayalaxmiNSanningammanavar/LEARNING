package _6_TempratureConverter;

import java.util.Scanner;

public class TempratureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Temprature to convert Farhenhiet to Celsius");
		double f1=scan.nextDouble();
		TempratureConverter tempratureConverter =new TempratureConverter();  
		System.out.println(tempratureConverter.convertFahrenheitToCelsius(f1));
				 
		 
		

	}

}
