package study1;


import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���������������");
		String name = scan.next();
		System.out.println("������������䣺");
		int age = scan.nextInt();
		System.out.println("�������Ϊ��"+name+"������Ϊ��"+age+"������");
		boolean user = scan.nextBoolean();//ture��false
		System.out.println("Okay!");
	}
}
