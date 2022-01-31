package javaTask;

public class Task01 {
	public static void main(String[] args) {
		int sum = 0;
		for (int number = 1; number <= 100; number++) {
			sum += number;
			System.out.println("合計は" + sum + "です。");
		}
	}
}
