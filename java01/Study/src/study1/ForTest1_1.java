package study1;

import java.util.Scanner;

public class ForTest1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������һ����������");
		int m = scan.nextInt();
		
		System.out.println("������ڶ�������");
		int n= scan.nextInt();
		
//		���������������Լ��
		int min = (m <= n)? m : n;
		for(int i = min; i >= 1; i--) {
			if(m % i == 0 && n % i == 0) {
				System.out.println("���Լ��Ϊ��"+i);
				break;
			}
		}
		
//		��������������С������
		int max = (m >= n)? m : n;
		for(int i = max; i <= m * n; i++) {
			if(i % m == 0 && i % n == 0) {
				System.out.println("��С������Ϊ��"+i);
				break;
			}
		}
		
	}
}
