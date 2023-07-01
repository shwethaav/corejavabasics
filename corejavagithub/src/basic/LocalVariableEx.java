package basic;

public class LocalVariableEx {
	String name="shwetha";
	  public void StudentAge()
	  {
		  //Local variable
		  int age=0;
		  age=age+30;
		  System.out.println("student age is:"+age);
	  }
      
	public static void main(String[] args) {
	// Local variable
	LocalVariableEx ex=new LocalVariableEx();
	  ex.StudentAge();
	System.out.println("name:"+ex.name);

	}

}
