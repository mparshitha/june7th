class Fish{
String name="bonyfish";
String type="osteichthyes";
double price;
String location;
Fish()
{
	System.out.println("Running no-arg const of main");
}
Fish(String name,String type)
{
System.out.println("Running String,String const of main");
System.out.println("name :"+ name);
System.out.println("type :"+ type);
this.name="bonyfish";
this.type="osteichthyes";
}
Fish(double price)
{
	System.out.println("running double const of main");
	this.price=price;
}
Fish(String location)
{
	System.out.println("Running string const of main");
	this.location=location;
}
Fish(String name,double price)
{
	System.out.println("Running string,double const of main");
	System.out.println("name :"+name);
	this.name=name;
	this.price=price;
}
}