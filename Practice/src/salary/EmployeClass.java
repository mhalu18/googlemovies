package salary;

import java.util.Scanner;

public class EmployeClass extends AbstractSal{@Override
	void calculateSal(int hours)
{
 
 int salary=salPerHour*hours;
 System.out.println("salary of contarc empley is       "+salary);
	
}
	
	
	public void calculateSal()
	{
		System.out.println("salary of perment emplye is      "+salPermentemp);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		EmployeClass employeClass=new EmployeClass();
		
		System.out.println("enter 1  to get contract employe salaery");
		System.out.println("enter 2  to get permanet employe salaery");
		 int emp=s.nextInt();
		switch (emp) {
		case 1 :
			System.out.println("enter how many hours employe worked");
			int hrs=s.nextInt();
			employeClass.calculateSal(hrs);
			break;
       case 2:
    	   employeClass.calculateSal();
			break;

		default:
			System.out.println("please select the valid employe");
			break;
		}
				
		
		
		
	}
	

}
