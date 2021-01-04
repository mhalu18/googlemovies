package array;

public class EvenOddFromArray {
public static void main(String[] args) {
	 int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
	 System.out.println("even number from array are");
	 for (int i = 0; i < arr.length; i++) {
		 if(arr[i]%2==0)
		 {
			 System.out.println(arr[i]);
		 }
		 
	}
	 
	 System.out.println("even Odd from array are");
	 for (int i = 0; i < arr.length; i++) {
		 if(arr[i]%2!=0)
		 {
			 System.out.println(arr[i]);
		 }
		 
	}
}
}
