
public class WrapperAndPrimitive {

	public static void maain(String[] args)
	{
		int a = 1;
		int b = 1;
		Integer bb = new Integer(a); //Interger class takes one parameter
		int vc = bb.intValue();
		
		Integer bbb = new Integer("1233"); //converts it to int...
		System.out.println(bbb.intValue());
		
		Integer in = 1123;
		
		System.out.println(in);
	}
	
}
