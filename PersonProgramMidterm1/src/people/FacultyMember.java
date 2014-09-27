package people;

public class FacultyMember extends Employee{
	private String hours = null;
	private String rank = null;
	
	public FacultyMember (String n, String a, String p, String e, String o, double s, MyDate d, String h, String r)
	{
		super(n, a, p, e, o, s, d);
		hours = h;
		rank = r;
	}
	
	public String getHours()
	{
		return hours;
	}
	
	public void getHours(String h)
	{
		hours = h;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public void setRank(String r)
	{
		rank = r;
	}
	
	@Override
	public String toString()
	{
		return "Faculty Member: " + super.getName();
	}

}
