package oops;

public class Polymorphism {

	public void sub(String A) {

		System.out.println(A);

	}

	public void sub(int a, int b) {

		System.out.println(a - b);

	}

	public static void main(String[] args) {

		Polymorphism P = new Polymorphism();
		P.sub("Bharath");
		P.sub(10, 5);

	}

}
