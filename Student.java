package studentscourse;

public class Student extends Person{
	Course offering;
	public Student(String num, String name, String gender, Course offering){
		super(num, name, gender);
		this.offering = offering;
	}
	public String toString() {
		return "编号："+num+"  姓名："+name+"  性别："+gender+"\n"+"  所选课程："+offering;
	}
}
