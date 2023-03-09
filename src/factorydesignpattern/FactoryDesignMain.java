package factorydesignpattern;

import java.util.Scanner;

public class FactoryDesignMain {

	public static void main(String[] args) {
		GetPlanFactory g=new GetPlanFactory();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the planname");
		String planName=sc.next();
		System.out.println("enter the number of units for bill will be calculated: ");
		int units=sc.nextInt();
		Plan p=g.getPlan(planName);
		System.out.println("Bill amount for"+planName+" of "+units+" units is:");
		p.getRate();
		p.calculationBill(units);
	}

}
