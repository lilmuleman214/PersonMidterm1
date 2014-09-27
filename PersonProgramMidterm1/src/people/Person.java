package people;

public class Person {
	private String name = null;
	private String address = null;
	private String phoneNumber = null;
	private String emailAddress = null;
	
	public Person(String n, String a, String p, String e)
	{
		name = n;
		address = a;
		phoneNumber = p;
		emailAddress = e;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String n){
		address = n;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setPhoneNumber(String n){
		phoneNumber = n;
	}
	
	public String getEmailAddress(){
		return emailAddress;
	}
	
	public void setEmailAddress(String n){
		emailAddress = n;
	}
	
	@Override
	public String toString()
	{
		return "Person: " + this.getName();
	}
}
