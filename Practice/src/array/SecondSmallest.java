package array;

public class SecondSmallest {
	public static void main(String[] args) {
		int []a ={ 10,6,8,5,14,17,20};
		int temp;
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]<a[j])
				 {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		 for(int i=0;i<a.length;i++)
		 {
			
		 }
		 System.out.println(a[a.length-2]+" is second largest number");
		
	}

}
