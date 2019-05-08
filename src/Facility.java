
public class Facility {

	public String name;
	public String description;
	
	
	public Facility(String name, String description) 
	{
		this.name = name;
		this.description = description;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public void show()
	{
		System.out.println(this);
	}
	
	
	@Override
	public String toString() {
		
		if(description == null)
			return this.name;
			
		else
			return this.name +" ( "+ this.description +" )";
	}
	
	
}
