package studentscourse;

public class Student extends Person{
	Course offering;
	public Student(String num, String name, String gender, Course offering){
		super(num, name, gender);
		this.offering = offering;
	}
	public String toString() {
		return "��ţ�"+num+"  ������"+name+"  �Ա�"+gender+"\n"+"  ��ѡ�γ̣�"+offering;
	}
}
