package study1;

public class RandomTest {

	public static void main(String[] args) {
		// ����һ���������0.0~1.0��
		
		double value = Math.random();
		System.out.println(value);
	}

}
//��ȡ[a,b]�����
//��ʽ��[a,b]��	(int)(Math.random() * (b - a + 1) + a)
//bվ�й��P100