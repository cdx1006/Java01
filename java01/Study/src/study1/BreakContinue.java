package study1;

/*
 break��continue�ؼ��ֵ�ʹ��
 					ʹ�÷�Χ					ѭ����ʹ�õ����ã���ͬ�㣩			��ͬ��
 break:				switch-case
 					ѭ���ṹ��				������ǰѭ��							�ؼ��ֺ��治������ִ�����
 
 continue:			ѭ���ṹ��				��������ѭ��							�ؼ��ֺ��治������ִ�����
 
 */
public class BreakContinue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1;i <= 10;i++) {
			if(i % 4 == 0) {
				break;
//				continue;
			}
			System.out.println(i);
		}
	}

}
