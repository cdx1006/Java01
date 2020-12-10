package com.study02.java;
/*
 * 类中方法的声明和使用
 * 
 * 方法：描述类应该具有的功能
 * 比如：Math类：sqrt()、random()......
 * 		Scanner类：nextXxx().....
 * 		Arrays类：sort()、binarySearch()、toString()、equals().....
 * 
 * 1.举例：
 * public void eat() {}
 * public void sleep(int hour) {}
 * public String getName() {}
 * public String getNation(String nation) {}
 * 
 * 2.方法的声明：权限修饰符 返回值类型 方法名(形参列表){
 * 						方法体
 * 				}
 * 
 * 3.说明：
 * 		3.1关于权限修饰符：
 * 			Java规定的4中权限修饰符：private、public、缺省、protected
 * 
 * 		3.2返回值类型：有返回值	vs	无返回值
 * 			3.2.1如果方法有返回值，则必须在方法声明时，指定返回值的类型，同时，方法中，
 * 				需要使用return关键字来返回指定类型的变量或常量
 * 				如果方法没有返回值，则方法声明时使用void来表示，通常，没有返回值的方法中
 * 				就不使用return，但是，如果使用的话，只能“return;”，表示结束此方法
 * 
 * 		3.3方法名：属于标识符，遵循标识符的规则和规范，“见名知意”
 * 		3.4形参列表；方法可以声明0个、1个、或多个形参
 * 			格式：数据类型1 形参1,数据类型2 形参2,......
 * 		3.5方法体；方法功能的体现
 * 
 * 4.return关键字的使用
 * 		1.使用范围；使用在方法体中
 * 		2.作用：结束方法
 * 				针对于有返回值类型的方法，使用“return 数值”方法返回所要的数值
 * 		3.注意点：return关键字后面不可以声明执行语句
 * 5.方法的使用中，可以调用当前类的属性或方法
 * 			特殊的，方法A中有调用了方法A：递归方法
 * 	方法中，不可以定义方法
 * */
public class CustomerTest {
	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.name = "cidy";
		cust1.age = 10;
		cust1.eat();
		cust1.sleep(8);
		System.out.println(cust1.getName());
		System.out.println(cust1.getNation("中国"));
		
	}
}

//客户类
class Customer{
	
	//属性
	String name;
	int age;
	boolean isMale;
	
	//方法
	public void eat() {
		System.out.println("客户吃饭");
	}
	
	public void sleep(int hour) {
		System.out.println("休息了" + hour + "个小时");
		eat();
	}
	
	public String getName() {
		if(age > 18) {
			return name;
		}
		return "Tom";
	}
	
	public String getNation(String nation) {
		String info = "我的国籍是" + nation;
		return info;
		//return后不能声明表达式
	}
}
