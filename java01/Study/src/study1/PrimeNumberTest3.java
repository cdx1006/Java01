package study1;

public class PrimeNumberTest3 {
	/*
	 * 100000���������������������
	 * ������������ֻ�ܱ�1����������������Ȼ����-->��2��ʼ���������-1����Ϊֹ�������ܱ��������������
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		��ȡ��ǰʱ����� 1970-01-01 00:00:00 �ĺ�����
		long start = System.currentTimeMillis();
		
		int count = 0;
		label:for(int i = 2;i <= 100000;i++) {//����100000���ڵ���Ȼ��
			for(int j = 2;j <= Math.sqrt(i);j++) {//j:��iȥ��
				if(i % j == 0) {//j��i����
					continue label;
				}
			}
			//��ִ�е��˲���Ķ�������
			count++;
		}
		
//		��ȡ��ǰʱ����� 1970-01-01 00:00:00 �ĺ�����
		long end = System.currentTimeMillis();
		System.out.println(count);
		System.out.println("�����ѵ�ʱ��Ϊ��"+(end - start));
	}
}


