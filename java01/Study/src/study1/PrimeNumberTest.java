package study1;

/*
 * 100�����������������
 * ������������ֻ�ܱ�1����������������Ȼ����-->��2��ʼ���������-1����Ϊֹ�������ܱ��������������
 */

public class PrimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isFlag = true;//��ʶj�Ƿ�i������һ���������޸���ֵ
		for(int i = 2;i <= 100;i++) {//����100000���ڵ���Ȼ��
			for(int j = 2;j < i;j++) {//j:��iȥ��
				if(i % j == 0) {//j��i����
					isFlag = false;
				}
			}
			if(isFlag == true) {
				System.out.println(i);
			}
			//����isFlag
			isFlag = true;
		}
	}

}
