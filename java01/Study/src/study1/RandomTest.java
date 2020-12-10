package study1;

public class RandomTest {

	public static void main(String[] args) {
		// 生成一个随机数（0.0~1.0）
		
		double value = Math.random();
		System.out.println(value);
	}

}
//获取[a,b]随机数
//公式：[a,b]：	(int)(Math.random() * (b - a + 1) + a)
//b站尚硅谷P100