class commandline
{
	public static void main(String[] args)
	{
	String name="ganesh";
		if (name.length > 0)
		 {
			System.out.println("The command line"+ " arguments are:");
			for (String val : name)
				System.out.println(val);
		}
		else
			
			System.out.println("No command line "+ "arguments found.");
							
	}
}
