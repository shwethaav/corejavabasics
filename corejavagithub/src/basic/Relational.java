package basic;

public class Relational {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		String s="shwetha";
		String s1="deepika";
		//Relation operator
		System.out.println(" equals:"+(s==s1));
		System.out.println("the two number are equal:"+(a==b));
		System.out.println("a not equal to b:"+(a!=b));
		System.out.println("a less b:"+(a<b));
		System.out.println("a grreater b:"+(a>b));
		int c=10001;
		int d=11001;
		//Bitwise operator
		System.out.println(" c&d:"+(c&d));
		System.out.println("c/d:"+(c/d));
		System.out.println("~"+(~d));
		//Shift operator
		 int x=0100;
		System.out.println("left:"+(x<<1));
		System.out.println(" left:"+(x<<2));
		System.out.println("left:"+(x<<3));
		System.out.println("right:"+(x>>1));
		System.out.println("right:"+(x>>2));
		System.out.println("right:"+(x>>3));
		//Ternary operator
		int e=5;
		int f=3;
		int g=8;
		int result=(e<f)?(e<g?e:g):(f<g?f:g);
		System.out.println("lowest of the  number:"+result);
		//String name="edubridge";
		//int n=60;
		//int  result= n>50? "pass":"fail";
		//System.out.println("the student eligible for certificate:"+result);
		//asssignment operator
		int i=20;
		int j=50;
		System.out.println("+="+(i+=j));
	}

}
