
public class Member extends Person {

	private int memberNumber;
	
	public int getMemberNumber() {
		return memberNumber;
	}

	public Member(String x, String y, String z, int i)
	{
		super(x,y,z);
		this.memberNumber = i;
	}
	
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public void show() 
	{
		System.out.println(this);
	}
	

	@Override
	public String toString() {
		return  super.toString() + " | "+"Member Number "+ memberNumber;
	}

	
	
	
}
