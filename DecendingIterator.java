package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class DecendingIterator {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("A");
		h.add("N");
		h.add("V");
		h.add("D");
		System.out.println(h);
		System.out.println("Descending Iterator");
		Iterator<String> itr=((Object) h).descendingIterator();
		while (itr.hasNext()) {
			String nameOfCity = (String) itr.next();
			System.out.println(nameOfCity);
		}
	}

}
