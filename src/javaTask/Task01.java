package javaTask;

public class Task01 {
	public static void main(String[] args) {
		int sum = 0;
		for (int number = 1; number <= 100; number++) {
			sum += number;
		}
		System.out.println("合計は" + sum + "です。");
		
		int sum1 = 0;
		int num1 = 1;
		while (num1 <= 100) {
			sum1 = sum1 + num1;
			num1 = num1 + 1;
		}
		System.out.println("合計: " + sum1);
	}
}
