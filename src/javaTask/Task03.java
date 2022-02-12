package javaTask;

public class Task03 {
	public static void main(String[] args) {
		System.out.println("* * * * * * * * *");
		System.out.println("  * * * * * * *");
		System.out.println("    * * * * *");
		System.out.println("      * * *");
		System.out.println("        *");

		int x, y;
		int row = 10;
		for (y = 0; y < 10; y++) {
			for (x = 0; x < y; x++) {
				System.out.println(" ");
			}
			for (x = row - y; x > 0; x--) {
				System.out.println("*"); 
			}
		}

	}
}
