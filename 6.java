class creation
{
int age;
String name;
int id;
public creation(int x,String y,int z)
{
age=x;
name=y;
id=z;
}
public creation()
{
age=17;
name="bobby";
id=119;
}
public void print()
{
System.out.println("name="+name);
System.out.println("age="+age);
System.out.println("id="+id);
}
public static void main(String args[])
{
creation ob=new creation(17,"ganesh",108);
creation ob2=new creation();
ob.print();
ob2.print();
}
} 
