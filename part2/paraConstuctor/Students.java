class Students 
{
	String name;
	String dept;
	double grade;

	Students(String name, String dept, double grade)
	{
		this.name = name;
		this.dept = dept;
		this.grade = grade;
	}

	public void StudentsAttributes() 
	{
		System.out.println("name :" +name);
		System.out.println("dept :" +dept);
		System.out.println("grade : " +grade);
	}
}
