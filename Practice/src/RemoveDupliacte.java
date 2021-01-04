
public class RemoveDupliacte {

	public static void main(String[] args) {
		String s="Whizible";
		char[] arry=s.toCharArray();
		String result= "";
		for(char value:arry)
		{
			if(result.indexOf(value)==-1)
			{
				result+=value;
			}
			
		}
		System.out.println(result);
		
	
}
}
