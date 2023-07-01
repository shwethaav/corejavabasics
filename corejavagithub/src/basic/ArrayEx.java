package basic;

public class ArrayEx {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9};
		int a[][]= {{3,4},{6,7},{8,9}};
		System.out.println("a[0][0]:"+a[0][0]);
		System.out.println("a[0][1]:"+a[0][1]);
		System.out.println("a[1][0]:"+a[1][0]);
		System.out.println("a[1][1]:"+a[1][1]);
		for(int i=0;i<3;i++) 
		for(int j=0;j<2;j++){
			System.out.println(a[i][j]);
	
		}
	}

}
