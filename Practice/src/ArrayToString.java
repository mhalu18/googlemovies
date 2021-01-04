
public class ArrayToString {

	public static void main(String[] args) {
		char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
		String s="";
		for(int i=0; i<=ch.length-1;i++)
		{
			s=s+ch[i];
		}
		System.out.println(s);
		System.out.println(String.valueOf(ch));
	
		

	}

}
