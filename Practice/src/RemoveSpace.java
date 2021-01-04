
public class RemoveSpace {
	public static void main(String[] args) {
		String s1=" hello ";
		String s2= "t u t o r i a l s";
		System.out.println(s1.trim());
		s2=s2.replaceAll(" ", "");
		System.out.println(s2);
		
	}

}
