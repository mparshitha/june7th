class Bottle{
int height=8;
char size;
double price=300;
Bottle()
{
	System.out.println("Running no-arg const of main");
}
Bottle(int height,char size)
{
System.out.println("Running int,char const of main");
System.out.println("height :"+ height);
System.out.println("size :"+ size);
this.height=8;
this.size=size;
}
Bottle(double price)
{
	System.out.println("running double const of main");
	this.price=300;
}
}