package javaTask;

public class Task02 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while (num <= 100) {
			++num;
			if (num%2 == 0) {
				sum = sum + num;
			}
		}
		System.out.println("偶数の和は" + sum);
	}
}
