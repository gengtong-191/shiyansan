package studentscourse;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Course course = null;
		Teacher teachcourse1 = new Teacher("01", "��", "M", "���Դ���");
		Teacher teachcourse2 = new Teacher("02", "ŷ", "W", "��ѧӢ������˵");
		Teacher teachcourse3 = new Teacher("03", "��", "M", "��ѧ����");
		Course course1 = new Course("1", "���Դ���", "��103", "9:40", teachcourse1);
		Course course2 = new Course("2", "��ѧӢ������˵", "��203", "15:50", teachcourse2);
		Course course3 = new Course("3", "��ѧ����", "��207", "13:30", teachcourse3);
		System.out.println("��ӭ����ѡ��ϵͳ:");
		System.out.println(course1);
		System.out.println(course2);
		System.out.println(course3);
		System.out.println("��ѡ��γ̣�����һ�ţ���");
			
		Scanner input1 = new Scanner(System.in);    //Scanner scanner = new Scanner(System.in);
		int i = input1.nextInt();    //ʹ��next()�����û�����
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
			 System.out.println("�γ̱�Ų�����");
		 }
		Student m = new Student("2019310163", "��ͮ", "Ů", course);
		System.out.println(m);
	
	
		System.out.println("�Ƿ��˿�?�ǣ�1  ��2");
		Scanner input2 = new Scanner(System.in); 
		int n = input2.nextInt();
		if(n==1) {
			Student m2 = new Student("2019310163", "��ͮ", "Ů", course);
			System.out.println("�˿γɹ�" +"  "+m2+"\n"+"ѡ�ν���");
		}
		else {
			System.out.println("ѡ�ν���");
		}
		input1.close();   //�ر�ͬʱ�ͷ��ڴ�
		input2.close();
		
	}
	}