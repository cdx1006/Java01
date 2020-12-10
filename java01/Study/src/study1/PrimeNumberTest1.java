package study1;

public class PrimeNumberTest1 {
	/*
	 * 100000以内所有质数的输出优化
	 * 质数：素数，只能被1和它本身整除的自然数。-->从2开始，到这个数-1结束为止，都不能被这个数本身整除
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		获取当前时间距离 1970-01-01 00:00:00 的毫秒数
		long start = System.currentTimeMillis();
		boolean isFlag = true;//标识j是否被i除尽，一旦除尽，修改其值
		for(int i = 2;i <= 100000;i++) {//遍历100000内的自然数
			for(int j = 2;j < i;j++) {//j:被i去除
				if(i % j == 0) {//j被i除尽
					isFlag = false;
					break;//优化一：只对本身非质数的自然数有效
				}
			}
			if(isFlag == true) {
				System.out.println(i);
			}
			//重置isFlag
			isFlag = true;
		}
//		获取当前时间距离 1970-01-01 00:00:00 的毫秒数
		long end = System.currentTimeMillis();
		System.out.println("所花费的时间为："+(end - start));
	}
}
