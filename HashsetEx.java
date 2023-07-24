package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashsetEx {

	public static void main(String[] args) {
		TreeSet<String> c=new TreeSet<String>();
		c.add("banagalore");
		c.add("managalore");
		c.add("mandya");
		c.add("gulbarga");
		c.remove("managalore");
		System.out.println(c);
		System.out.println("Retrive data using iterator");
		Iterator<String> iterator=c.iterator();
		while(iterator.hasNext()) {
			String nameOfCity=iterator.next();
			System.out.println(nameOfCity);
		}
	}

}
