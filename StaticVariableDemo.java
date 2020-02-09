class A
{
static int i=10;
int j=10;
void m1()
{
System.out.println("m1-A");
System.out.println(this.i);
}
}
class StaticVariableDemo
{
public static void main(String args[])
{
A a=new A();
System.out.println(a.i);
System.out.println(A.i);
a.m1();
A a1=null;
System.out.println(a1.i);
//System.out.println(a1.j);//NullPointerException
}
}

import static java.lang.Thread;
import static java.lang.System.out;
class StaticImport
{
public static void main(String args[])
{
out.println(MIN_PRIORITY);
out.println(MAX_PRIORITY);
out.println(NORM_PRIORITY);
}
}
