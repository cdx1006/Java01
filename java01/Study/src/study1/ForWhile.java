package study1;

//	�Ӽ��̶��������ȷ�������������ж϶���������͸����ĸ���������Ϊ0ʱ��������

import java.util.Scanner;
public class ForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int positiveNumber = 0;//��¼�����ĸ���
		int negativeNumber = 0;//��¼�����ĸ���
		while(true) {//for(;;){
			System.out.println("����������������0��������");
			int number = scan.nextInt();
			
			if(number > 0) {
				positiveNumber++;
			}else if(number < 0) {
				negativeNumber++;
			}else {
				//һ��ִ��break;����ѭ��
				break;
			}
		}
		System.out.println("�������������Ϊ��"+positiveNumber);
		System.out.println("����ĸ�������Ϊ��"+negativeNumber);
	}

}
