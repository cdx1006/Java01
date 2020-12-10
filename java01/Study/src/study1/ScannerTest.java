package study1;


import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入你的姓名：");
		String name = scan.next();
		System.out.println("请输入你的年龄：");
		int age = scan.nextInt();
		System.out.println("你的姓名为："+name+"，年龄为："+age+"，对吗？");
		boolean user = scan.nextBoolean();//ture或false
		System.out.println("Okay!");
	}
}
