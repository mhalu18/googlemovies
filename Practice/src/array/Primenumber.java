package array;

public class Primenumber {
	public static void main(String[] args) {
		int []a={4,9,5,10,15,14};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=2;j<a[i]-1;j++)
			{
				if(a[i]%j==0)
				{
					count=count+1;
				}
			}
			if(count==0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}

}
