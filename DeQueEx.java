package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueEx {

	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<Integer>();
		dq.offerFirst(7);//add the element
		dq.offer(5);
		dq.add(7);
		System.out.println(dq);
		int r=dq.pollLast();// last element delete
		System.out.println(r);
		System.out.println(dq);
		int n=dq.pollFirst();
		System.out.println(n);
		System.out.println(dq);
		int s=dq.poll();
		System.out.println(s);
		System.out.println(dq);
	}

}
