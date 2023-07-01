package basic;
   class Student{
	   public static double fees;
	   public static String name="Shwetha";
   }
   
public class StaticVariable {

	public static void main(String[] args) {
		Student.fees=10000;
		String name1="deepika";
		System.out.println("student fees is:"+Student.fees);
		System.out.println("Student name is :"+Student.name);	
		System.out.println("'student name:"+name1);
	}

}
