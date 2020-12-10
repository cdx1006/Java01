package com.study01.java;

public class ArrayTest4 {

	public static void main(String[] args) {
		
		String[] arr = new String[] {"A","B","C","D","E","F"};
		
		//数组变量的赋值：arr1和arr地址值相同，都指向了堆空间的唯一的一个数组实体
		//String arr1[] = arr;//相当于将数组arr地址值给了数组arr1
		
//		数组的复制（区别于数组变量的赋值：arr1 = arr）
		String arr1[] = new String[arr.length];
		for(int i = 0;i < arr1.length;i++) {
			arr1[i] = arr[i];
		}
		
		//数组的反转
		//方法一
		for(int i= 0;i < arr.length / 2;i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		
		//方法二
//		for(int i = 0,j = arr.length - 1;i < j;i++,j--) {
//			String temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = arr[i];
//		}
		
		//遍历
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
		//查找（或搜索）
		//线性查找
		String desc = "C";
		boolean isFlag = true;
		for(int i = 0;i < arr.length;i++) {
			if(desc.equals(arr[i])) {
				System.out.println("找到了指定的元素，位置为：" + i);
				isFlag = false;
				break;
			}
		}
		if(isFlag) {
			System.out.println("很遗憾，没有找到指定元素!");
		}
		
		//二分法查找：
		//前提：所要查找的数组必须有序
		int[] arr2 = new int[] {-98,-34,2,34,54,66,79,105,210,333};
		
		int desc1 = -34;
		int head = 0;//初始的首索引
		int end = arr.length - 1;//初始的末（尾）索引
		boolean isFlag1 = true;
		while(head <= end) {
			
			int middle = (head + end)/2;
			if(desc1 == arr2[middle]) {
				System.out.println("找到了指定的元素，位置为：" + middle);
				isFlag1 = false;
				break;
			}else if(arr2[middle] > desc1) {
				end = middle - 1;
			}else {//arr2[middle] < desc1
				head = middle + 1;
			}
		}
		if(isFlag1) {
			System.out.println("很遗憾，没有找到指定元素!");
		}
	}

}
