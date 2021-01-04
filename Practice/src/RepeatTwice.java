
public class RepeatTwice {

	public static void main(String[] args) {
		String s1="Welcome";
		String s2="";
		int leng=s1.length();
		for (int i=0;i<leng;i++)
		{
			s2+=s1.substring(i, i+1)+s1.substring(i, i+1);
		}
		
		System.out.println(s2);

	}

}
//stringbuilder