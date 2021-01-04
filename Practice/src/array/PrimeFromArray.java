package array;

public class PrimeFromArray {
public static void main(String[] args) {
	int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
	int count = 0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]%1==0&&arr[i]%arr[i]==0) {
			System.out.println(arr[i]);
			count++;
		}
		if(count==2)
		{
			System.out.println(arr[i]+"number is prime");
		}
		
	}
	 
} 
}
