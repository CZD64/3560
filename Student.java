
public class Student {
	
	private String name;
	private String major;
	private double gpa;
	

	public Student() {
		super();
	}


	public Student(String name, String major) {
		super();
		this.name = name;
		this.major = major;
	}


	public Student(String name, String major, double gpa) {
		super();
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Student's name is " + name + ", major is " + major + ", gpa is " + gpa;
	}
	
	public boolean equals(Student student)
	{
		if (this.name == student.name && this.major == student.major)
			return true;
		else
			return false;
	}


	

}
