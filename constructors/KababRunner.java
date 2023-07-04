class KababRunner{
public static void main(String[] things)
{
System.out.println("running main of FishRunner class");
Kabab ref=new Kabab();
System.out.println(ref.name);
Kabab ref1=new Kabab("fishkabab","Ramahotel"); 
System.out.println(ref1.name);
System.out.println(ref1.hotelName);
Kabab ref2=new Kabab(7);
System.out.println(ref2.noOfPieces);
Kabab ref3=new Kabab();
System.out.println(ref3.price);
Kabab ref4=new Kabab();
System.out.println(ref4.takeAway);
System.out.println(ref4.price);
}
}