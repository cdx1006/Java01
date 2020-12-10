package study1;

/*
 * 100以内所有质数的输出
 * 质数：素数，只能被1和它本身整除的自然数。-->从2开始，到这个数-1结束为止，都不能被这个数本身整除
 */

public class PrimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isFlag = true;//标识j是否被i除尽，一旦除尽，修改其值
		for(int i = 2;i <= 100;i++) {//遍历100000以内的自然数
			for(int j = 2;j < i;j++) {//j:被i去除
				if(i % j == 0) {//j被i除尽
					isFlag = false;
				}
			}
			if(isFlag == true) {
				System.out.println(i);
			}
			//重置isFlag
			isFlag = true;
		}
	}

}
