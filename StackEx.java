package Collection;

import java.util.Stack;

public class StackEx {
	public static void main (String args[]) {
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println("Stack Element:"+s);
		System.out.println("stack empty?"+ s.isEmpty());
		System.out.println("Stack size:"+s.size());
		s.pop();
		System.out.println("pop the elemets:"+s.pop());
		s.peek();
		System.out.println("peek element:"+s.peek());
		System.out.println("Stack Element:"+s);
		int search = s.search(20);
		System.out.println("search element:"+search);
	    s.indexOf(10);
	    System.out.println("index of number"+s.indexOf(10));
	    s.lastIndexOf(20);
	    System.out.println("last index of :"+s.lastIndexOf(20));

	}

}
