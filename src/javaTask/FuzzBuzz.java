package javaTask;

public class FuzzBuzz {
	public static void main(String[] args) {
		int i = 0;
		int loopcount = 100;
		int fizz = 3;
		int buzz = 5;
		String strfizz = "Fizz";
		String strbuzz = "Buzz";
		
		for (i = 1; i <= loopcount; i++) {
			if (i % (fizz * buzz) == 0) {
				System.out.println(strfizz + strbuzz);
			} else if (i % fizz == 0) {
				System.out.println(strfizz);
			} else if (i % buzz ==0 ) {
				System.out.println(strbuzz);
			} else {
				System.out.println(i);
			}
		}
	}
}
