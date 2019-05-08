import java.util.ArrayList;
import java.util.List;

public class ClubApplication {

	public static void main(String[] args)
	{
		
		Member p1,p2,p3,p4,p5;
		
		Club c = new Club();
		p1 = c.addMembers("Indrajit",null,"Maurya");
		p2 = c.addMembers("Harsha","Vardhini","Moorthy");
		p3 = c.addMembers("Soehan",null,"Kyaw");
		p4 = c.addMembers("Wang",null,"Hengyue");
		p5 = c.addMembers("Wesley",null,"singapore");
		c.showMembers();
		System.out.println("REMOVING");
		c.removeMembers(3);
		c.removeMembers(p5.getMemberNumber());
		
		c.showMembers();
		//c.removeMembers(p1.getMemberNumber());
		
		//Facility f = new Facility("Meeting","Conference at 3PM");
		//f.show();
		
	}
}
