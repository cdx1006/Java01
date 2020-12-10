package study1;

public class whileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		遍历100以内的偶数,并计算所有偶数的和以及偶数的个数
		int num = 1;
		int sum = 0;//记录总和
		int count = 0;//记录个数
		while(num <= 100) {
			if(num % 2 == 0) {
				System.out.println(num);
				sum += num;
				count++;
			}
			num++;
		}
		System.out.println("总和为："+sum);
		System.out.println("个数为："+count);
	}

}
