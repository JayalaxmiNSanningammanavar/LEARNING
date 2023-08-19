package _3TaxCalculator;

import java.util.Scanner;

public class TaxCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Purchase amount:");
		double purchaseamount=scan.nextDouble();
		System.out.println("Enter the tax rate"+"(in decimal form):");
		double taxrate=scan.nextDouble();
		TaxCalculator t=new TaxCalculator();
		System.out.println("Total cost including tax:"+t.calculateTotalWithTax(purchaseamount,taxrate));
		
		
	}

}
