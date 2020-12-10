package com.study01.java;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] ids;//声明
		//静态初始化：数组的初始化和数组元素的赋值操作同时进行
		ids = new int[] {1001,1002,1003,1004};
		
		//动态初始化：数组的初始化和数组元素的赋值操作分开进行
		String[] names = new String[5];
		
//		也是正确写法：
		int arr1[] = new int[]{1,2,3,4};
		int[] arr2 = {1,2,3,4,5};//类型推断
		//总结：数组一旦初始化完成，其长度就确定了
		
		names[0] = "周某人";
		names[1] = "王某某";
		names[2] = "张三";
		names[3] = "李四";
		names[4] = "王五";
		
		//获取数组的长度
		//属性：length
		System.out.println(names.length); 
		System.out.println(ids.length);
		
		//遍历数组
		for(int i = 0;i < names.length;i++) {
			System.out.println(names[i]);
		}
		 
	}	
}
