package array;
import java.util.*;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add('a');
		obj.add("mhalu");
		obj.add(12);
		obj.add("mhalu");
		obj.add(null);
		//System.out.println(obj);
		//System.out.println(obj.size());
		//System.out.println(obj.get(2));
		ArrayList obj1=new ArrayList();
		obj1.add('b');
		obj1.add("vitthal");
		obj1.add(15);
		Iterator n=obj1.iterator();
		while(n.hasNext())
		{
			System.out.println(n.next());
		}
		System.out.println(obj1);
		obj.add(obj1);
		System.out.println(obj);
		obj.addAll(obj1);
		System.out.println(obj);
	//	Collections.sort(obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		ArrayList<Integer> obj2=new ArrayList<Integer>();
		obj2.add(106);
		obj2.add(125);
		obj2.add(124);
		obj2.add(121);
		obj2.add(123);

		Collections.sort(obj2);
		for(Object objref:obj2)
		{
			System.out.println(objref);
		}
		ArrayList obj3=new ArrayList();
		obj3.add("mhalu");
		obj3.add("litthal");
		obj3.add("nmahs");
		obj3.add("osjdjd");
		obj3.add("psks");
		//obj3.add(null);

		Collections.sort(obj3);
		for(Object objref1:obj3)
		{
			System.out.println(objref1);
		}
		
		ArrayList<Integer> obj6=new ArrayList<Integer>();
		obj6.add(106);
		obj6.add(125);
		obj6.add(124);
		obj6.add(121);
		obj6.add(123);
		System.out.println(obj6);
		ArrayList<Integer> obj7=new ArrayList<Integer>();
		obj7.add(106);
		obj7.add(125);
		obj7.add(129);
		obj7.add(128);
		obj7.add(123);
		System.out.println(obj7);
		obj6.removeAll(obj7);
		System.out.println(obj6);

	}

}
