package study1;

public class LabelBreakContinue {

	public static void main(String[] args) {
		// ����ǩ��break��continue���÷�

		label:for(int i = 1;i <= 4;i++) {
			for(int j = 1;j <= 10;j++) {
				if(j % 4 == 0) {
//					break;//Ĭ�����������˹ؼ��������һ��ѭ��
//					continue;
					
					break label;//����ָ����ʶ��һ��ѭ���ṹ
//					continue label;//����ָ����ʶ��һ��ѭ���ṹ����ѭ��
				}
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
