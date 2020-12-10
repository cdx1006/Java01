package study1;

import java.util.Scanner;

public class ForTest1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入一个正整数：");
		int m = scan.nextInt();
		
		System.out.println("请输入第二个数：");
		int n= scan.nextInt();
		
//		求两个整数的最大公约数
		int min = (m <= n)? m : n;
		for(int i = min; i >= 1; i--) {
			if(m % i == 0 && n % i == 0) {
				System.out.println("最大公约数为："+i);
				break;
			}
		}
		
//		求两个整数的最小公倍数
		int max = (m >= n)? m : n;
		for(int i = max; i <= m * n; i++) {
			if(i % m == 0 && i % n == 0) {
				System.out.println("最小公倍数为："+i);
				break;
			}
		}
		
	}
}
