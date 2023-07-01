package basic;

public class CloneEx {

	public static void main(String[] args) {
		int intArray[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int cloneArray[] = intArray.clone();
		// single dimension
		System.out.println(intArray == cloneArray);
		for (int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i]+" ");
		}
		 /* int intArray[][]= {{1,2,3,4,5},{6,7,8,9,10}}; int
		 cloneArray[][]=intArray.clone(); 
		 //multi dimension
		  System.out.println(intArray[0]==cloneArray[0]);
		  System.out.println(intArray[1]==cloneArray[1]);*/

	}

}
