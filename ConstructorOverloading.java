class A
{
int i,j,k;
A()
{
}
A(int i1){
i=i1;
}
A(int i1,int j1){
i=i1;
j=j1;
}
A(int i1,int j1,int k1){
i=i1;
j=j1;
k=k1;
}
void add()
{
System.out.println("Addition "+(i+j+k));
}
}
class ConstructorOverloading
{
public static void main(String args[])
{
A a1=new A();
a1.add();
A a2=new A(10);
a2.add();
A a3=new A(10,20);
a3.add();
A a4=new A(10,20,30);
a4.add();
}
}
class A
{
int i,j,k;
A()
{
}
A(int i1){
i=i1;
}
A(int i1,int j1){
i=i1;
j=j1;
}
A(int i1,int j1,int k1){
i=i1;
j=j1;
k=k1;
}
void add()
{
System.out.println("Addition "+(i+j+k));
}
}
class ConstructorOverloading
{
public static void main(String args[])
{
A a1=new A();
a1.add();
A a2=new A(10);
a2.add();
A a3=new A(10,20);
a3.add();
A a4=new A(10,20,30);
a4.add();
}
}
