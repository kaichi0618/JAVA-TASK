package javaTask;

public class Task03 {
	public static void main(String[] args) {
		System.out.println("* * * * * * * * *");
		System.out.println("  * * * * * * *");
		System.out.println("    * * * * *");
		System.out.println("      * * *");
		System.out.println("        *");

		for (int i = 5; i > 0; i = i -2) {
			for (int blank = 0; blank < 3; blank++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}
