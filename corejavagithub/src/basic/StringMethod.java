package basic;

public class StringMethod {

	public static void main(String[] args) {
	 String s="shwetha";
	 String s1="deepika";
	 System.out.println("Length of the string is:"+ s.length());
	 System.out.println("Uppercase"+s.toUpperCase());
	 System.out.println("Lowercase"+s.toLowerCase());
	 System.out.println("combine the both the string:"+s.concat("deepika"));
	 System.out.println("both the strings are equal"+s.equals(s1));
	 System.out.println("Character at position 2:"+s.charAt(2));
	 System.out.println("Compare two string : "+s.compareTo(s1));
	 System.out.println("Lowercase"+s.toLowerCase());
	 System.out.println("equal ignore case "+s.equalsIgnoreCase(s1));
	 System.out.println("string contain w"+s.contains("w"));
	 System.out.println("index of :"+s.indexOf('w'));
	 System.out.println("last index of  :"+s.lastIndexOf('a'));
	 System.out.println("replace  of :"+s.replace("shwetha","deepika"));
	 System.out.println("sub part of the string :"+s.substring(3,4));
	 System.out.println("trim :"+s.trim());
	 String s4="darshan";
	 String arrs[]=s4.split("",3);
	 System.out.println("Split the elements :");
	 for(int i=0;i<arrs.length;i++) {
		 System.out.println(arrs[i]+"");
		 System.out.println();
		 System.out.println("Split the elements using for each loop");
		 for(String s2:arrs) {
			 System.out.println(s2+"");
		 }
		 String s5="";
		 System.out.println("is empty:"+s5.isEmpty());
		 System.out.println("is blank:"+s5.isBlank());
	 }
	}

}
