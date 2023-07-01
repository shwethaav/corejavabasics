package basic;

public class Tochararray {

	public static void main(String[] args) {
	  /*String str="   hi edubridge ";  
	  char[] arr= str.toCharArray();
	  for(char c:arr) {
		  if(c!='') {
			  tempStr+=c;
		  }
		  System.out.println("Temp"+TempStr);
	  }
	  str=tempStr;
	System.out.println(str);

	}

}*/
String str = "Welcome to edubridge    ";

//convert string into character array
char[] arr = str.toCharArray();   
String tempStr = "";
for(char c:arr){
    
    if(c != ' '){
        tempStr += c;
    }
    System.out.println("Temp"+tempStr);
}
	}
}
