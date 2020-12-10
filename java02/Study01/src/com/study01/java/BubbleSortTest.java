package com.study01.java;

public class BubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {99,9,-1,0,-98,16,34,-60,72};
		
		//冒泡排序
		for(int i = 0;i < arr.length - 1;i++) {
			
			for(int j = 0;j < arr.length - 1 - i;j++) {
				
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "  ");
		}
	}

}
