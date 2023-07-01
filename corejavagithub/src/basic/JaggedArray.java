package basic;

public class JaggedArray {
	//an array of arrays of which the member
			//arrays can be of different lengths,
			//producing rows of jagged edges when
			//visualized as output.
	/*public static void main(String[] args) {
	 int arr[][]=new int[5][];
	 arr[0]=new int[] {1,2,3,4,5};
	 arr[1]=new int[] {6,7,8,9};
	 arr[2]=new int[] {10,11,12,13};
	 arr[3]=new int[] {14,15,16,17,18};
	 arr[4]=new int[] {19,20,21,22,23};
	 System.out.println("Elments of jagged array:");
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr[i].length;j++)
			 System.out.println(arr[i][j]+"");
		 System.out.println();
	 }*/
	public static void main(String[] args) {
	 int arr[][] = new int[5][]; 
    
    arr[0] = new int[]{99,100,101};
    arr[1] = new int[]{199,200};
    arr[2] = new int[]{299,300,301,302,303};
    arr[3]=new int[]{2,3};
    arr[4]=new int[] {6,89,90,45};

     System.out.println("Elements of  Jagged Array");
     for (int i = 0; i < arr.length; i++) {//row
         for (int j = 0; j < arr[i].length; j++)//col
             System.out.print(arr[i][j] + " ");
         System.out.println();//next line

	}

}
}
