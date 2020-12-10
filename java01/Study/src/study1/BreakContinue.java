package study1;

/*
 break和continue关键字的使用
 					使用范围					循环中使用的作用（不同点）			相同点
 break:				switch-case
 					循环结构中				结束当前循环							关键字后面不能声明执行语句
 
 continue:			循环结构中				结束当次循环							关键字后面不能声明执行语句
 
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
