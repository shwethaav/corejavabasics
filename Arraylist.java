package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("shwetha");
		a.add("deepika");
		a.add("lavanya");
		a.set(2, "naveen");
		//ArrayList<integer> list a3= new ArrayList<>();
	//	Collections.addAll(list, 1, 2, 3, 4, 5);
		ArrayList<String> a2=new ArrayList<String>();
		a2.addAll(a);
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("shwetha", "deepika"));
		System.out.println("Element present in arraylist :"+a);
		a.sort(Comparator.reverseOrder());
		System.out.println("reverse order"+a);
		System.out.println("Size of arraylist :"+a.size());
		System.out.println("Element present in 2Position :"+a.get(2));
		a.add("");
		System.out.println("Element present in arraylist :"+a);
		System.out.println("Size of arraylist :"+a.size());
		a.remove(1);
		System.out.println("Element present in arraylist :"+a);
		System.out.println("Size of arraylist :"+a.size());
		a.set(2, "vaishu");
		System.out.println("Element present in arraylist :"+a);
		System.out.println("Size of arraylist :"+a.size());
		
		
	}

}