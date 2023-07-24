package Collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	 String studentname;
	 int   rollno;
	 int idno;
	 int age;
	public Student(String studentname, int rollno, int idno, int age) {
		super();
		this.studentname = studentname;
		this.rollno = rollno;
		this.idno = idno;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", rollno=" + rollno + ", idno=" + idno + ", age=" + age + "]";
	}
	  }
class SortByage implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		
		return a.age-b.age ;
	}
	
}
 
public class ComparatorStudentEx {

	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student("shwetha", 50, 23,45));
		s.add(new Student("Deepika", 23, 32,56));
		s.add(new Student("lavanya", 32, 12,34));
		Collections.sort(s,new SortByage());
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		
		

	}

}
