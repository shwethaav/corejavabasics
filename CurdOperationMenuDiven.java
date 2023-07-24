package Collection;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Scanner;

class Learner {
	int lno;
	String lname, ldegree;
	public Object getlno11;

	public int getLno() {
		return lno;
	}

	public void setLno(int lno) {
		this.lno = lno;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLdegree() {
		return ldegree;
	}

	public void setLdegree(String ldegree) {
		this.ldegree = ldegree;
	}

	public Learner(int lno, String lname, String ldegree) {
		super();
		this.lno = lno;
		this.lname = lname;
		this.ldegree = ldegree;
	}

	@Override
	public String toString() {
		return "Learner [lno=" + lno + ", lname=" + lname + ", ldegree=" + ldegree + "]";
	}
}

public class CurdOperationMenuDiven {

	private static final ArrayList<Learner> c = null;

	public static void main(String[] args) {
			ArrayList<Learner> l = new ArrayList<Learner>();
			Scanner sc = new Scanner(System.in);
			int choice;
			do {
				System.out.println("1.Insert data");
				System.out.println("2.Display data");
				System.out.println("3.search the data");
				System.out.println("4.Delete  the data");
				System.out.println("5.Update the data");
				System.out.println("Enter your  choice:");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter lno");
					int lno = sc.nextInt();
					System.out.println("Enter lname");
					String lname = sc.next();
					System.out.println("Enter degree");
					String degree = sc.next();
					l.add(new Learner(lno, lname, degree));
					break;
				case 2:
					Iterator<Learner> n = l.iterator();
					while (n.hasNext()) {
						Learner le = n.next();
						System.out.println(le);
						break;
					}

				case 3:
					boolean found = false;
					System.out.print("Enter lno to Search : ");
					int lno1 = sc.nextInt();

					Iterator<Learner> i = l.iterator();
					while (i.hasNext()) {
						Learner e = i.next();
						if (e.getLno() == lno1) {
							System.out.println(e);
							found = true;

						}
					}
						if (!found) {
							System.out.println("Record Not Found");
						}
						break;
						
				
				case 4:
				System.out.println("Enter the lno to delete:");
			    int lno11=sc.nextInt();
			    l.remove(lno11);
			    System.out.println("the record deleted sucessfully");
			    
			    	System.out.println("Record is deleted sucessfully");
		case 5:
		   // boolean found11 =false;
		    System.out.println("Enter the lno to update");
		   lno11 =sc.nextInt();
		   System.out.println("Enter a new name:");
		   String degree1=sc.next();
		  Iterator<Learner> li=c.iterator();
		   while(li.hasNext()) {
			Learner next=li.next();
			next.setLdegree(degree1);
			}
		}
		/*if(!found11) {
			System.out.println("Record not found");
		}
		else {
			*/System.out.println("Record is updated sucessfully");
	}while(choice!=0);
}
}
