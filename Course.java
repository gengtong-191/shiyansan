package studentscourse;

public class Course {
	String num;
	String name;
	String place;
	String time;
	Teacher teachername;
	public Course(String num, String name, String place, String time, Teacher teachername) {
		this.num = num;
		this.name = name;
		this.place = place;
		this.time = time;
		this.teachername = teachername;
	}
	public String toString() {
		return "\n"+"��ţ�"+num+"  �γ����ƣ�"+name+"  �Ͽεص㣺"+place+"  ʱ�䣺"+time+ "\n"+"  �ڿν�ʦ��"+teachername;
	}
}
