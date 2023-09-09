class A{
	String name;
	public void getname(String a)
	{
		name=a;
	}
	public void putname()
	{
		System.out.println("name="+name);
	}
}
class inherit extends A{
	int id;
	public void getid(int b)
	{
		id=b;
	}
	public void putid()
	{
		System.out.println("id="+id);
	}
}
class hello{
	public static void main(String args[])
	{
		inherit ob=new inherit();
		ob.getname("ganesh");
		ob.getid(108);
		ob.putname();
		ob.putid();
	}
}
