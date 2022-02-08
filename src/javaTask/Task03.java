package javaTask;

public class Task03 {
	public static void main(String[] args) {
		System.out.println("* * * * * * * * *");
		System.out.println("  * * * * * * *");
		System.out.println("    * * * * *");
		System.out.println("      * * *");
		System.out.println("        *");

		int num = 9;
		String str = "*";
		String blank = " ";
		while (num > 0) {
			System.out.println(blank + num * str);
			num = num - 2;
			
		}

	}
}
