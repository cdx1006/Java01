package study1;

public class dowhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		����100���ڵ�ż��,����������ż���ĺ��Լ�ż���ĸ���
		int num = 1;//��¼�ܺ�
		int sum = 0;//��¼����
		int count = 0;
		do {
			if(num % 2 == 0) {
				System.out.println(num);
				sum += num;
				count++;
			}
			num++;
		}while(num <= 100);
		System.out.println("����Ϊ��"+sum);
		System.out.println("����Ϊ��"+count);
	}

}
