package study1;

public class ForForTest {

	public static void main(String[] args) {
/*
 * �����
			* 
		   * * 
		  * * * 
		 * * * * 
		* * * * * 
		 * * * * 
		  * * * 
		   * * 
		    * 
*/

		//�������У�
		for(int i = 1;i <= 5;i++) {
			for(int j = 1;j <= 5 - i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k <= i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//�������У�
		for(int i = 1;i <= 4;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k <= 5 - i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}