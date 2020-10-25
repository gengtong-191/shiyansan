package studentscourse;

public class Teacher extends Person{
	String teachcourse;
	public Teacher(String num, String name, String gender, String teachcourse){
		super(num, name, gender);
		this.teachcourse = teachcourse;
	}
	public String toString() {
		return "\n"+"编号："+num+"  姓名："+name+"  性别："+gender+"  所授课程："+teachcourse;
	}
}

