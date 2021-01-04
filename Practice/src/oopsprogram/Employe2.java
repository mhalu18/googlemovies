
package oopsprogram;

public class Employe2 {
	double esalary=2500;
	public void salary()
	{
		System.out.println("employe salary"+esalary);
	}

}
class Manager extends Employe2
{
	double msalary=3000;
	public void salary()
	{
		System.out.println("manger salary"+msalary);
	}
	
}
class Clerk extends Employe2
{
double csalary=2000;
public void salary()
{
	System.out.println("clerk salary"+csalary);
}
}
class company
{
	public static void main(String[] args) {
		Clerk cl=new Clerk();
		cl.salary();
		Employe2 e2=cl;
		e2.salary();
	 Manager mn=new Manager();
	 mn.salary();
	 Employe2 e3=mn;
	 e3.salary();
		
		
	}
	
	
}