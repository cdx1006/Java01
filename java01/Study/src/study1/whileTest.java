package study1;

public class whileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		����100���ڵ�ż��,����������ż���ĺ��Լ�ż���ĸ���
		int num = 1;
		int sum = 0;//��¼�ܺ�
		int count = 0;//��¼����
		while(num <= 100) {
			if(num % 2 == 0) {
				System.out.println(num);
				sum += num;
				count++;
			}
			num++;
		}
		System.out.println("�ܺ�Ϊ��"+sum);
		System.out.println("����Ϊ��"+count);
	}

}
