package oopsprogram;

public class TrimReverseOdd {
	public static void main(String[] args) {
		String s=" Ivavsys  has a good team ";
		System.out.println(s);
		String s1="";
		String s3="";
		char[] ca=s.toCharArray();
		for(int i=ca.length-1;i>0;i--)
		{
			if (ca[i] !=' ') {
				s1=s1+ca[i];
			}
		}
		System.out.println( s1);
		for(int i=0;i<s1.length();i++)
		{
			if (i%2!=0) {
				
				s3=s3+s1.charAt(i);
			}
		}
		System.out.println(s3);
		
	}

	
	


	
}
