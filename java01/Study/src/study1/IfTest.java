package study1;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		//输入三个整数实现从小到大输出
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个整数：");
		int num2 = scanner.nextInt();
		System.out.println("请输入第三个整数：");
		int num3 = scanner.nextInt();
		
		if(num1 >=num2) {
			if(num3 >= num1) {
				System.out.println(num2+","+num1+","+num3);
			}else if(num3 <= num2) {
				System.out.println(num3+","+num2+","+num1);
			}else {
				System.out.println(num2+","+num3+","+num1);
			}
		}else {
			if(num3 >= num2) {
				System.out.println(num1+","+num2+","+num3);
			}else if(num3 <= num1){
				System.out.println(num3+","+num1+","+num2);
			}else {
				System.out.println(num1+","+num3+","+num2);
			}
		}
	}

}
