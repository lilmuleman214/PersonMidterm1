package people;

public class StaffMember extends Employee{
	private String title = null;
	
	public StaffMember (String n, String a, String p, String e, String o, double s, MyDate d, String t)
	{
		super(n, a, p, e, o, s, d);
		title = t;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void getTitle(String h)
	{
		title = h;
	}
	
	
	@Override
	public String toString()
	{
		return "Staff Member: " + super.getName();
	}

}