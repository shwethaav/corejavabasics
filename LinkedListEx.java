package Collection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> l =new LinkedList();
		l.add("Shwetha");
		l.add("deepika");
		l.add(0, "Vaishanvi");
		l.add("lavanya");
		l.add(" ");
		System.out.println("Elements in My LinkedList :"+l);
		System.out.println("Size Of My LinkedList :"+l.size());
		System.out.println("GetElements in My LinkedListt :"+l.get(1));
		l.remove(3);
		System.out.println("Elements in My LinkedList"+l);
		l.remove("Vaishanvi");
		System.out.println("Elements in My LinkedList"+l);
		l.set(2,"taruna");
		System.out.println("Set in My LinkedList :"+l);
		LinkedList<String>l1=new LinkedList();
		l1.addAll(l);
		System.out.println("AllElements in My LinkedList :"+l1);
l.addFirst("akash");
		System.out.println(" AddFirst Elements in My LinkedList :"+l);
		l.addLast("sai");
		System.out.println(" AddLast Elements in My LinkedList :"+l);
		System.out.println(" getFirst Elements in My LinkedList :"+l.getFirst());
		System.out.println(" getLast Elements in My LinkedList :"+l.getLast());
		System.out.println(" PeekFirst Elements in My LinkedList :"+l.peekFirst());
		System.out.println(" PeekLast Elements in My LinkedList :"+l.peekLast());
	


	}

}
		
