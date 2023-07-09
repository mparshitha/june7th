class Worker{
String name;
double salary;
int experience;
int  height;
int age;
Worker(String name,double salary,int experience,int height,int age)
{
System.out.println("Running String,double,String,String,double const of  Worker");
this.name=name;
this.salary=salary;
this.experience=experience;
this.height=height;
this.age=age;
}
void printInstanceVariable()
{
System.out.println("Running printInstanceVariable of the const main");
System.out.println(this.name);
System.out.println(this.salary);
System.out.println(this.experience);
System.out.println(this.height);
System.out.println(this.age);
}
}