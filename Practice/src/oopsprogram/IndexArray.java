package oopsprogram;

import java.util.Scanner;

//Write a Java program to find the index of an array element.find index of 56 value
//Original Array:  int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//Sample Output: Index position of 25 is: 0      
//                          Index position of 77 is: 6     

public class IndexArray {
	
	
	public static void main(String[] args) {
		
		 int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		 Scanner s =new Scanner(System.in);
		 System.out.println("enter the number to check index");
		 int number=s.nextInt();
		 
		 for(int  i=0;i<a.length;i++)
			{
				if(a[i]==number)
				{
					 System.out.println("index of given numbe "+number+"is   :   "+i);
				
				}
				
			}
		 
		
		 
		 
	}

}
