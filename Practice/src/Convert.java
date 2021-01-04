
public class Convert {

	public static void main(String[] args) {
		 String input="PUNE";
		 char[]ch=input.toCharArray();
		 int[]ch1=new int[ch.length];
		 char[]result=new char[input.length()];
		 for(int i=0;i<ch.length;i++)
		 {
			ch1[i]=ch[i]-3;
			result[i]=(char) ch1[i];
		 }
		 System.out.println(result);
		 
		 

	}

}
