package oopsprogram;

public class Area {
  public double area(int a,int b)
  {
	  double area=0.5*a*b*b;
	  System.out.println("area of triangle is"+area);
	  return area;
	  
  }
	 
  public double area(int a ,double b)
  {
	  double area=a*b;
	  System.out.println("area of rectangle is"+area);
	  return area;
  }
  public static double area(int a)
  {
	  double area=3.142*a*a;
	  System.out.println("area of circle is"+area);
	  return area;
  }
  public double area(double a)
  {
	  double area=a*a;
	  System.out.println("area of sqaure is"+area);
	  return area;
  }
public static void main(String[] args) {
	area(10);
}
}
