package basic;

public class StringBufferEx {

	public static void main(String[] args) {
		// StringBuffer s=new StringBuffer("shwetha");
		StringBuilder s = new StringBuilder("shwetha");
		s.append("deepika");
		String str1 = "darshan";
		System.out.println(s);
		System.out.println("Length of the string is:" + s.length());
		// System.out.println("Length of the string is:"+ s.is());
		System.out.println("combine the both the string:" + str1.concat("deepika"));
		System.out.println("Character at position 2:" + s.charAt(2));
		System.out.println("both the strings are equal" + s.equals(str1));
		System.out.println("Character at position 2:" + s.charAt(2));
		System.out.println("sub part of the string :" + s.substring(3, 4));
		String s4 = "Edubridge";
		String arrs[] = s4.split("", 2);
		System.out.println("Split the elements :");
		for (int i = 0; i < arrs.length; i++) {
			System.out.println(arrs[i] + "");
			System.out.println();
			System.out.println("Split the elements using for each loop");
			for (String s2 : arrs) {
				System.out.println(s2 + "");
			}
			System.out.println("insert:  " + s.insert(0, "welcome"));
			s.insert(2, "hi");
			System.out.println(s);
			s.replace(1, 2, "hello");
			s.reverse();
			System.out.println("reverse" + s.reverse());
			System.out.println(s.capacity());
			s.append(s);
			System.out.println("is empty:" + s.isEmpty());
			System.out.println("is blank:" + str1.isBlank());

		}

	}
}
