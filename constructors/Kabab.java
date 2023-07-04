class Kabab{
String name="fishkabab";
String hotelName="RamaHotel";
double price;
int noOfPieces=7;
boolean takeAway;
Kabab()
{
	System.out.println("Running no-arg const of main");
}
Kabab(String name,String hotelName)
{
System.out.println("Running String,String const of main");
System.out.println("name :"+ name);
System.out.println("hotelName :"+ hotelName);
this.name="fishkabab";
this.hotelName="RamaHotel";
}
Kabab(double price)
{
	System.out.println("Running double const of main");
	this.price=price;
}
Kabab(int noOfPieces)
{
	System.out.println("Running int const of main");
	System.out.println("noOfPieces :"+ noOfPieces);
	this.noOfPieces=7;
}
Kabab(boolean takeAway,double price)
{
	System.out.println("Running boolean,double const of main");
	this.takeAway=takeAway;
    this.price=price;
}
}