
public class CountString {

	public static void main(String[] args) {
		String s1="java again java";
		int length=s1.length();
		int count=0;
		 for(int i=0;i<=length-1;i++)
		 {
			 if(s1.charAt(i)=='a')
			 {
				 count++;
			 }
			
		 }
		 System.out.println(count);
		 
	

	}

}
