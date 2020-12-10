package study1;

public class PrimeNumberTest3 {
	/*
	 * 100000以内所有质数个数的输出
	 * 质数：素数，只能被1和它本身整除的自然数。-->从2开始，到这个数-1结束为止，都不能被这个数本身整除
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		获取当前时间距离 1970-01-01 00:00:00 的毫秒数
		long start = System.currentTimeMillis();
		
		int count = 0;
		label:for(int i = 2;i <= 100000;i++) {//遍历100000以内的自然数
			for(int j = 2;j <= Math.sqrt(i);j++) {//j:被i去除
				if(i % j == 0) {//j被i除尽
					continue label;
				}
			}
			//能执行到此步骤的都是质数
			count++;
		}
		
//		获取当前时间距离 1970-01-01 00:00:00 的毫秒数
		long end = System.currentTimeMillis();
		System.out.println(count);
		System.out.println("所花费的时间为："+(end - start));
	}
}


