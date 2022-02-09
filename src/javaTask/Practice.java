package javaTask;

public class Practice {
	public static void main(String[] args) {
		int sum = 0;
		int num = 1;

		for (num = 1; num <= 100; num++) {
			sum += num;
		}
		System.out.println("合計は" + sum);
		
		int sum1 = 0;
		
		for (int num1 = 2; num1<=100; num1++) {
			if (num1 % 2 ==0) {
				sum1 += num1;
			}
		}
		System.out.println("sum1:" + sum1);
		
	}

}
