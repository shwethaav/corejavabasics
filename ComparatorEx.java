package Collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	String eName;
	int eSalary;
	
	LocalDate eDateOfJoining;
	String eDesignation;
	
	public Employee(String eName, int eSalary, LocalDate eDateOfJoining, String eDesignation) {
		super();
		this.eName = eName;
		this.eSalary = eSalary;
		this.eDateOfJoining = eDateOfJoining;
		this.eDesignation = eDesignation;
	}

	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eSalary=" + eSalary + ", eDateOfJoining=" + eDateOfJoining
				+ ", eDesignation=" + eDesignation + "]";
	}

	
	
}
class SortByDOJ implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.eDateOfJoining.compareTo(o2.eDateOfJoining);
	}
	
}

public class ComparatorEx {

	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee("shwetha", 50000, LocalDate.of(2022,2,1), "SrDevOps"));
		e.add(new Employee("Deepika", 50000, LocalDate.of(2021,3,1), "SrDevOps"));
		e.add(new Employee("Lavanya", 50000, LocalDate.of(2020,4,1), "SrDevOps"));
		e.add(new Employee("Sneha", 50000, LocalDate.of(2023,5,1), "SrDevOps"));
		e.add(new Employee("vaishu", 50000, LocalDate.of(2020,6,1), "SrDevOps"));
		e.add(new Employee("taruna", 50000, LocalDate.of(2019,7,1), "SrDevOps"));
		Collections.sort(e,new SortByDOJ());
		for(int i =0;i<e.size();i++) {
			System.out.println(e.get(i));
		}
	}
}
