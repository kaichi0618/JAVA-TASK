package javaTask;

public class Task02 {
	public static void main(String[] args) {
		int num = 2;
		int sum = 0;
		while (num <= 100) {
			if (num % 2 == 0) {
				sum = sum + num;
			}
			++num;
		}
		System.out.println("2から100までの偶数の和は" + sum);
		
		int sum1 = 0;
		for(int i = 2; i <= 100; i++){
			if(i % 2 == 0){
				sum1 += i;
			}
		}
		System.out.println("2から100までの偶数の和は" + sum1);
	}
}
