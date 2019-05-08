
public class Person {

	private String firstName;
	private String secondName;
	private String surName;
	public String fullname;
	
	public Person(String x, String y, String z)
	{
		this.firstName = x;
		this.secondName = y;
		this.surName = z;
	}
	
	public Person()
	{
		
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public void show()
	{
		System.out.println(this);
	}
	
	@Override // overrides the Parent class which is the Object Class
	public String toString() {
		
		if(secondName == null || secondName.isEmpty())
		{
			fullname = this.firstName +" "+ this.surName;
		}
		else
		{
			fullname = this.firstName +" "+ this.secondName +" "+ this.surName;
		}
		return "Person: " + fullname;
	}
	
	
	
}
