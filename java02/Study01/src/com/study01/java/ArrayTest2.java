package com.study01.java;

public class ArrayTest2 {

	public static void main(String[] args) {
		//二维数组的声明和初始化
		
		//静态初始化
		int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
		
		//动态初始化1
		String[][] arr2 = new String[3][2];
		//动态初始化2
		String[][] arr3 = new String[3][];
		
		//错误的写法：
//		String[][] arr4 = new String[][4];
		
		//正确：
//		String arr5[][] = new String[3][2];
//		String[] arr5[] = new String[3][2];
//		int[][] arr5 = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
		int[][] arr5 ={{1,2,3},{4,5},{6,7,8,9}};//类型推断
		
		//调用二维数组指定位置的元素
		System.out.println(arr1[0][1]);//2
		System.out.println(arr2[0][1]);//null
		
		arr3[1] = new String[3];
		System.out.println(arr3[1][0]);//null
		
		//获取二维数组长度
		System.out.println(arr1.length);//3
		System.out.println(arr1[0].length);//3
		System.out.println(arr1[1].length);//2
		System.out.println(arr1[2].length);//4
		
		//二维数组的遍历
		for(int i = 0;i < arr1.length;i++) {
			for(int j = 0;j < arr1[i].length;j++) {
				System.out.print(arr1[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
