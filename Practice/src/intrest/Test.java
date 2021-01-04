package intrest;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
 
	
	
//	Icici icici=new Icici();
//	icici.intrest(2000, 12);
//	BOI boi=new BOI();
//	boi.intrest(250000, 12);
	Scanner s=new Scanner(System.in);
	System.out.println("For Axis Enter =>  1");
	System.out.println("For ICICI Enter =>  2");
	System.out.println("For BOI Enter =>  3");
	System.out.println("ENTER BANK CODE");
	
	int bankCcde=s.nextInt();
	

	switch (bankCcde) {
	case 1:
		Axis axis=new Axis();
		System.out.println("ENTER PRINCIPAL AMT");
		int p=s.nextInt();
		System.out.println("ENTER TIME");
		int t=s.nextInt();
		axis.intrest(p, t);
		break;
		
	case 2:
		Icici icici = new Icici();
		System.out.println("you have selected Icici Bank");
		System.out.println("ENTER PRINCIPAL AMT");
		
		int p1=s.nextInt();
	
		System.out.println("ENTER TIME");
		int t1=s.nextInt();
		
		icici.intrest(p1, t1);
		break;
		
	case 3:
			BOI boi = new BOI();
			System.out.println("ENTER PRINCIPAL AMT");
			int p3=s.nextInt();
			System.out.println("ENTER TIME");
			int t3=s.nextInt();
			boi.intrest(p3, t3);
		break;
		
		default:
			System.out.println("No such a bank please provide valid info");
		
	}
	
}
}
