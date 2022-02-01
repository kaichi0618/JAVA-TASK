package javaTask;

public class FuzzBuzz {
	public static void main(String[] args) {
		int num = 0;
		int fizz = 3;
		int buzz = 5;
		for (num = 1; num <= 100; num++) {
			if (num % (fizz * buzz) == 0) {
				System.out.println("fizzbuzz");
			} else if (num % fizz == 0) {
				System.out.println("fizz");
			} else if (num % buzz ==0 ) {
				System.out.println("buzz");
			} else {
				System.out.println(num);
			}
		}
	}
}
