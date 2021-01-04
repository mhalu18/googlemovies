
public class StartsWith {
	public static void main(String[] args) {
		String s="  Red is favorite colo";
		String s2="  Orange is also my favorite color";
		String s3=s.substring(0, 3);
		String s4=s2.substring(0, 3);
		if(s3==s4)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
	}
//string length
}
