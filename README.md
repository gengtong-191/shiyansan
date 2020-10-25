#计191耿彤2019310163

#第三次实验

##一.实验目的

（1）初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；

（2）掌握面向对象的类设计方法（属性、方法）；

（3）掌握类的继承用法，通过构造方法实例化对象；

（4）学会使用super()，用于实例化子类；

（5）掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

##二.业务要求

说明：教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。

对象：

教师（编号、姓名、性别、所授课程）

学生（编号、姓名、性别、所选课程）

课程（编号、课程名称、上课地点、时间）

##三实验要求

1.编写上述实体类以及测试主类（注意类之间继承关系的适用）

2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。

3.编写实验报告。

##四.流程图

##五.核心代码

这部分代码是学生选课后询问是否退课的代码，先用switch语句判断选了哪门课，打印出来，再用if判断句询问是否退课，再接着打印之后的选课结果。


Scanner input1 = new Scanner(System.in);    //Scanner scanner = new Scanner(System.in);
int i = input1.nextInt();    //使用next()接受用户输入
```
switch(i) {
		 case 1:
			 course = course1;
			 break;
		 case 2:
			 course = course2;
			 break;
		 case 3:
			 course = course3;
			 break;
		 default:
			 System.out.println("课程编号不存在");
		 }
    Student m = new Student("2019310163", "耿彤", "女", course);
		System.out.println(m);
	  System.out.println("是否退课?是：1  否：2");
		Scanner input2 = new Scanner(System.in); 
		int n = input2.nextInt();
		if(n==1) {
			Student m2 = new Student("2019310163", "耿彤", "女", course);
			System.out.println("退课成功" +"  "+m2+"\n"+"选课结束");
		}
		else {
			System.out.println("选课结束");
		}
		input1.close();   //关闭同时释放内存
		input2.close();
```

##六.实验过程

1.确定Personnel为父类，Teacher和Student为子类， 用extends继承父类的属性和方法

2.确定每个类所拥有的属性并依据属性类型定义为整型，字符型等

3.用this关键字给每一个变量传递它们的值

4.利用super函数调用父类的构造方法，实例化子类

5.在父类Personnel和Courses类里利用toString来返回字符串本身

6. 利用Scanner来获取用户的输入，switch判断学生选课，再用if语句判断是否退课

7.打印

##七.实验结果

![a](https://github.com/gengtong-191/shiyansan/blob/main/105edb2575a3f1d1fb3500ca112f499.png)

##八.实验感想

最前面是extends，子类继承父类的应用，一个父类两个字类分别继承；在test类中接触到了Scanner的用法，学会了如何使用switch循环以及if的应用，要注意case和default在switch里的用法；if else的用法；中间还要打印出结果，最后用close（）关闭释放内存。

这次实验充分体会到做实验之前要搞清楚实验目的和要求，考虑清楚每个个体所具备的属性以及它们之间的继承关系，先有个大体思路，明确思路后开始编程，处理好细节，最后完成。
