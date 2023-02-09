package array;

class Teacher
{
	private String teacherName;
	private String subject;
	private double salary;
	
	Teacher(String teacherName,String subject,double salary)
	{
		this.teacherName=teacherName;
		this.subject=subject;
		this.salary=salary;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void display()
	{
		System.out.println("name: "+getTeacherName()+" "+"subject: "+getSubject()+"salary: "+getSalary());
	}
	
}
