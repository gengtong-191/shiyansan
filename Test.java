package studentscourse;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Course course = null;
		Teacher teachcourse1 = new Teacher("01", "赵", "M", "线性代数");
		Teacher teachcourse2 = new Teacher("02", "欧", "W", "大学英语视听说");
		Teacher teachcourse3 = new Teacher("03", "孙", "M", "大学物理");
		Course course1 = new Course("1", "线性代数", "教103", "9:40", teachcourse1);
		Course course2 = new Course("2", "大学英语视听说", "教203", "15:50", teachcourse2);
		Course course3 = new Course("3", "大学物理", "教207", "13:30", teachcourse3);
		System.out.println("欢迎来到选课系统:");
		System.out.println(course1);
		System.out.println(course2);
		System.out.println(course3);
		System.out.println("请选择课程（仅限一门）：");
			
		Scanner input1 = new Scanner(System.in);    //Scanner scanner = new Scanner(System.in);
		int i = input1.nextInt();    //使用next()接受用户输入
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
		
	}
	}