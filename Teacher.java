package studentscourse;

public class Teacher extends Person{
	String teachcourse;
	public Teacher(String num, String name, String gender, String teachcourse){
		super(num, name, gender);
		this.teachcourse = teachcourse;
	}
	public String toString() {
		return "\n"+"��ţ�"+num+"  ������"+name+"  �Ա�"+gender+"  ���ڿγ̣�"+teachcourse;
	}
}

