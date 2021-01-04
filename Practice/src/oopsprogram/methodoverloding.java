package oopsprogram;

public class methodoverloding {
	public static int addopertors( int a ,int b)
	{
		int c=a+b;
		return c;
		
	} 
	public static  double opertors(int a ,double b)
	{
		double c=a+b;
		return c;
	}
	public static double opertor(double a ,float b)
	{
		double c=a+b;
		return c;
	}
	public static double opertor(double a,double b)
	{
		double c=a+b;
		return c;
	}
	public static void main(String[] args) {
	System.out.println(opertor(10,20));
		
	}
}
