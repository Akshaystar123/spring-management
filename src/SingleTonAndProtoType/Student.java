package SingleTonAndProtoType;

public class Student {

	private int Stuid;
	
	private String Stuname;

	public Student() {
		super();
		
   System.out.println("Student class constructor");
	}

	public int getStuid() {
		return Stuid;
	}

	public void setStuid(int stuid) {
		Stuid = stuid;
	}

	public String getStuname() {
		return Stuname;
	}

	public void setStuname(String stuname) {
		Stuname = stuname;
	}

	@Override
	public String toString() {
		return "Student [Stuid=" + Stuid + ", Stuname=" + Stuname + "]";
	}
}
