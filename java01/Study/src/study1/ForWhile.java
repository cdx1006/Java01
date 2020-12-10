package study1;

//	从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序

import java.util.Scanner;
public class ForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int positiveNumber = 0;//记录正数的个数
		int negativeNumber = 0;//记录负数的个数
		while(true) {//for(;;){
			System.out.println("请输入整数（输入0结束）：");
			int number = scan.nextInt();
			
			if(number > 0) {
				positiveNumber++;
			}else if(number < 0) {
				negativeNumber++;
			}else {
				//一旦执行break;跳出循环
				break;
			}
		}
		System.out.println("输入的正数个数为："+positiveNumber);
		System.out.println("输入的负数个数为："+negativeNumber);
	}

}
