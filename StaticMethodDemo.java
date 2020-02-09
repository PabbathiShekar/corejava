class A
{
int i=10;
static int j=20;
static void m1()
{
System.out.println("m1-A");
System.out.println(j);
//System.out.println(i);//Error
//System.out.println(this.j);
A a=new A();
System.out.println(a.i);
}
void m2()
{
System.out.println("m2-A");
this.m1();
}
}
class StaticMethodDemo
{
public static void main(String args[])
{
A a1=new A();
a1.m1();
a1=null;
a1.m1();
A.m1();
//a1.m2();//runtime error
}
}

