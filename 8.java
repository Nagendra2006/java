class overload
{
public void add(int x,int y)
{
	int sum=x+y;
	System.out.println("sum="+sum);
}
public void add(int x,int y,int z)
{
	int sum=x+y+z;
	System.out.println("sum="+sum);
}
public static void main(String args[])
{
overload ob=new overload();
ob.add(10,20);
ob.add(22,43);
}
}
