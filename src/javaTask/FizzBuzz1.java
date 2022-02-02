package javaTask;

public class FizzBuzz1 {
	public static void main(String[] args) {
		int i = 0;
		int loopcount = 100;
		int numFizz = 3;
		int numBuzz = 5;
		String strfizz = "Fizz";
		String strbuzz = "Buzz";
		
		for (i = 1; i <= loopcount; i++) {
			if (i % (numFizz * numBuzz) == 0) {
				System.out.println(strfizz + strbuzz);
			} else if (i % numFizz == 0) {
				System.out.println(strfizz);
			} else if (i % numBuzz ==0 ) {
				System.out.println(strbuzz);
			} else {
				System.out.println(i);
			}
		}
	}
}
