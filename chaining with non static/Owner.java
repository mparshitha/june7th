class Owner{
String name;
int age;
double height;
int weight;
float property;
Owner(String name,int age,double height,int weight,int property)
{
System.out.println("Running String,int,double,int,int const of  Owner");
this.name=name;
this.age=age;
this.height=height;
this.weight=weight;
this.property=property;
}
void printInstanceVariable()
{
System.out.println("Running printInstanceVariable of the const main");
System.out.println(this.name);
System.out.println(this.age);
System.out.println(this.height);
System.out.println(this.weight);
System.out.println(this.property);
}
}