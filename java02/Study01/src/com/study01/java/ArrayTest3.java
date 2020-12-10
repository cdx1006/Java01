package com.study01.java;

public class ArrayTest3 {

	/* 二维数组的使用 ：
	 * 规定：二维数组分为外层数组的元素，内层数组的元素
	 * int[][] arr = new int[4][3];	 
	 * 外层元素：arr[0],arr[1]等
	 * 内层元素：arr[0][0],arr[1][2]等
	 * 
	 * 数组元素的默认初始化值
	 * 针对于初始化方式一：比如：int[][] arr = new int[4][3];
	 * 外层元素的初始化值为：地址值
	 * 内层元素的初始化值：与一维数组初始化情况相同
	 * 
	 * 针对于初始化方式二：比如：int[][] arr = new int[4][];
	 * 外层元素的初始化值为：null
	 * 内层元素的初始化值为：不能调用，否则报错
	 * */
	public static void main(String[] args) {
		
		int[][] arr = new int[4][3];
		System.out.println(arr[0]);//地址值：[I@5b6f7412
		System.out.println(arr[0][0]);//0
//		System.out.println(arr);//地址值：[[I@27973e9b
		
		System.out.println("***************");
		
		float[][] arr1 = new float[4][3];
		System.out.println(arr1[0]);//地址值
		System.out.println(arr1[0][0]);//0
//		System.out.println(arr1);//[[F@312b1dae
		
		System.out.println("***************");
		
		String[][] arr2 = new String[4][2];
		System.out.println(arr2[1]);//地址值
		System.out.println(arr2[1][1]);//null
		System.out.println(arr2);//地址值：[[Ljava.lang.String;@7530d0a
		
		System.out.println("***************");
		
		double[][] arr3 = new double[4][];
		System.out.println(arr3[1]);//null
//		System.out.println(arr3[1][1]);//报错
	}

}
