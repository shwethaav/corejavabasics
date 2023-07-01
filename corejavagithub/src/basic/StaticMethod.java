package basic;

class Operation {
	void addition(int a, int b, int c) {
		System.out.println("Addition of number three number:" + a + b + c);
	}

	int add(int a, int b) {
		return a + b;
	}

	int mul(int a, int c) {
		return a * c;
	}

	int divide(int a, int b) {
		return a / b;
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		Operation op = new Operation();
		op.add(23, 34);
		op.mul(2, 3);
		op.divide(4, 26);
		System.out.println("addition of number:" + op.add(23, 5));
		System.out.println("multification of number:" + op.mul(56, 89));
		System.out.println("division of number" + op.divide(3, 16));

	}

}
