class Oil{
String name;
double prize;
String brand;
String color;
double calorificValue;
Oil(String name,double prize,String brand,String color,double calorificValue)
{
System.out.println("Running String,double,String,String,double const of  Oil");
this.name=name;
this.prize=prize;
this.brand=brand;
this.color=color;
this.calorificValue=calorificValue;
}
void printInstanceVariable()
{
System.out.println("Running printInstanceVariable of the const main");
System.out.println(this.name);
System.out.println(this.prize);
System.out.println(this.brand);
System.out.println(this.color);
System.out.println(this.calorificValue);
}
}