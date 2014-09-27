package people;

public class Student extends Person{

	private enum Status {FRESHMEN, SOPHOMORE, JUNIOR, SENIOR};
	private Status classStatus = null;
	
	public Student(String name, String address, String phone, String email, Status year)
	{
		super(name, address, phone,email);
		classStatus = year;
	}
	
	public String getClassStatus()
	{
		if (classStatus == Status.FRESHMEN)
		{
			return "Freshmen";
		} else if (classStatus == Status.SOPHOMORE)
		{
			return "Sophomore";
		} else if (classStatus == Status.JUNIOR)
		{
			return "Junior";
		} else if (classStatus == Status.SENIOR)
		{
			return "Senior";
		} else
			return "Not in School";
	}
	
	@Override
	public String toString()
	{
		return "Student: " + super.getName();
	}
}
