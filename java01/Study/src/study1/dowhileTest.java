package study1;

public class dowhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		遍历100以内的偶数,并计算所有偶数的和以及偶数的个数
		int num = 1;//记录总和
		int sum = 0;//记录个数
		int count = 0;
		do {
			if(num % 2 == 0) {
				System.out.println(num);
				sum += num;
				count++;
			}
			num++;
		}while(num <= 100);
		System.out.println("总数为："+sum);
		System.out.println("个数为："+count);
	}

}
