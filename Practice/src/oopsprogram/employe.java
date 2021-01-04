package oopsprogram;

public class employe {
private	String name;
private	int age;
private	double salary;
private	String destination;
 
employe(String ename,int eage,double esalary,String edestination)
{
	this.name=ename;
	this.age=eage;
	this.salary=esalary;
	this.destination=edestination;
	
}
public double getsalary()
{
	return salary;
}
public void setsalary(double sal)
{
	this.salary=sal;
}
}
class Timesheet {
	public static void main(String[] args) {
		employe e=new employe("mhalu",25,2500,"tester");
		System.out.println(e.getsalary());
		e.setsalary(20000);
		System.out.println(e.getsalary());
		
	}
	
	
	
}
