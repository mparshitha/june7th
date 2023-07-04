class Scissor{
String brand="ButterCut";
String color="Black";
String type;
String usage="cutting various thin materials";
char size=8;
double price;
String material="carbon steel";
Scissor()
{
	System.out.println("Running no-arg const of main");
}
Scissor(String brand,String color)
{
System.out.println("Running String,String const of main");
System.out.println("brand :"+ brand);
System.out.println("color :"+ color);
this.brand="ButterCut";
this.color="Black";
}
Scissor(String type)
{
	System.out.println("Running String const of main");
	this.type=type;
}
Scissor(String usage,char size)
{
	System.out.println("Running String,char const of main");
	System.out.println("usage :"+ usage);
    System.out.println("size :"+ size);
	this.usage="cutting various thin materials";
	this.size=size;
}
Scissor(double price,String type)
{
	System.out.println("Running double,String const of main");
	System.out.println("price :"+ price);
	System.out.println("type :"+ type);
	this.price=price;
	this.type=type;
}
Scissor(String material,double price)
{
	System.out.println("Running String,double const of main");
	System.out.println("material :"+ material);
	System.out.println("price :"+ price);
	this.material="carbon steel";
	this.price=price;
}
Scissor(String brand,String color,double price)
{
	System.out.println("Running String,String,double const of main");
	System.out.println("brand :"+ brand);
	System.out.println("color :"+ color);
	this.brand="ButterCut";
	this.color="Black";
	this.price=price;
}
}