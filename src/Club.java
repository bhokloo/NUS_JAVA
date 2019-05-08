
public class Club {

	private int currentNumbers = 0;
	private Member[] members = new Member[0];
	
	public Member addMembers(String x, String y, String z)
	{
		currentNumbers++;
		checkSize();
		Member mem= new Member(x,y,z,currentNumbers);
		members[currentNumbers - 1] = mem;
		return mem;
		
	}
	public void checkSize()
	{
		Member[] newarray= new Member[currentNumbers];
		if(members.length > 0)
		{
			int z = 0;
			for(Member mm: members)
			{
				newarray[z] = mm;
				z++;
			}
			
		}
		members = newarray;
	}
	
	public void showMembers()
	{
		for(Member m : members)
		{	
			if(m!= null)
			System.out.println(m); 
		}
		
	}
	
	public void removeMembers(int i)
	{
		for(int z = 0; z < members.length; z++)
		{
			if(members[z] != null)
			{
				if(members[z].getMemberNumber() == i)
				{
					members[z] = null;
				}
			}
		}
	}
	
}
