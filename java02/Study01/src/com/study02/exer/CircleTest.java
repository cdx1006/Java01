package com.study02.exer;
/*
 * 利用面向对象的编程方法，设计类Circle计算圆的面积
*/
//测试类
public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 2;
		System.out.println("面积为：" + c1.findArea());
	}
}

//圆
class Circle{
	
	//属性
	double radius;
	
	//求圆面积
	public double findArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
}
