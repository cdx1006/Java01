package study1;

public class PrimeNumberTest1 {
	/*
	 * 100000������������������Ż�
	 * ������������ֻ�ܱ�1����������������Ȼ����-->��2��ʼ���������-1����Ϊֹ�������ܱ��������������
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		��ȡ��ǰʱ����� 1970-01-01 00:00:00 �ĺ�����
		long start = System.currentTimeMillis();
		boolean isFlag = true;//��ʶj�Ƿ�i������һ���������޸���ֵ
		for(int i = 2;i <= 100000;i++) {//����100000�ڵ���Ȼ��
			for(int j = 2;j < i;j++) {//j:��iȥ��
				if(i % j == 0) {//j��i����
					isFlag = false;
					break;//�Ż�һ��ֻ�Ա������������Ȼ����Ч
				}
			}
			if(isFlag == true) {
				System.out.println(i);
			}
			//����isFlag
			isFlag = true;
		}
//		��ȡ��ǰʱ����� 1970-01-01 00:00:00 �ĺ�����
		long end = System.currentTimeMillis();
		System.out.println("�����ѵ�ʱ��Ϊ��"+(end - start));
	}
}
