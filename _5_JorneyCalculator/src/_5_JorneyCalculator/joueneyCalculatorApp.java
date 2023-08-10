package _5_JorneyCalculator;

import java.util.Scanner;

public class joueneyCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter speed and time to caculate distance" );
double speed=scan.nextDouble();
double time=scan.nextDouble();
JourneyCalculator  journeyCalculator=new JourneyCalculator(); 
double distance=journeyCalculator.calculateDistance(speed,time);
System.out.println(distance);
	}

}
